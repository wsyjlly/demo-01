package cn.wsyjlly.controller;

import org.springframework.ui.ModelMap;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author wsyjlly
 * @create 2019.06.13 - 17:23
 **/
@RestController
public class FileUploadController {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public final String UPLOAD_PATH = "/data/uploadFiles/";
    public final Integer SUCCESS = 1;
    public final Integer FAILURE = 0;

    /*
     * 单文件上传
     * */
    @PostMapping("/upload")
    public ModelMap upload(MultipartFile uploadFile, HttpServletRequest request) throws FileNotFoundException {
        ModelMap map = new ModelMap();
        if (uploadFile == null){
            map.addAttribute("status",FAILURE);
            map.addAttribute("message","未选择文件");
            return map;
        }
        System.out.println();
        File file = new File(System.getProperty("user.dir")+UPLOAD_PATH);
        if(!file.exists()){//如果文件夹不存在
            file.mkdirs();//创建文件夹
        }
        String rootPath = file.getAbsolutePath();
        System.out.println("根路径："+rootPath);

        String format = sdf.format(new Date());
        File folder = new File(rootPath+'/' + format);
        if (!folder.isDirectory()){
            folder.mkdirs();
        }
        System.out.println("文件夹路径:"+folder.getAbsolutePath());
        String originalFilename = uploadFile.getOriginalFilename();
        System.out.println("文件原名："+originalFilename);
        String newName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
        try {
            uploadFile.transferTo(new File(folder,newName));
            String filePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/uploadFiles/" + format+"/" + newName;
            System.out.println("文件访问路径："+filePath);
            map.addAttribute("filePath",filePath);
            map.addAttribute("status",SUCCESS);
            return map;
        } catch (IOException e) {
            e.printStackTrace();
        }
        map.addAttribute("status",FAILURE);
        return map;
    }

    /*
     * 多文件上传
     * */
    @PostMapping("/uploads")
    public ModelMap uploads(MultipartFile[] uploadFiles, HttpServletRequest request) throws FileNotFoundException {
        ModelMap map = new ModelMap();
        System.out.println("文件个数："+uploadFiles.length);
        String realPath = ResourceUtils.getURL("classpath:").getPath()+UPLOAD_PATH;
        String format = sdf.format(new Date());
        File folder = new File(realPath + format);
        if (!folder.isDirectory()){
            folder.mkdirs();
        }
        HashMap<String, Map> fileListUploadStatus = new HashMap<>();
        for (MultipartFile file:uploadFiles){
            HashMap<String, Object> item = new HashMap<>();
            String originalFilename = file.getOriginalFilename();
            System.out.println("————————————————————————————————");
            System.out.println("文件原名："+originalFilename);
            System.out.println("文件大小："+file.getSize());
            System.out.println("文件类型："+file.getContentType());
            String newName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
            try {
                file.transferTo(new File(folder,newName));
                String filePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/" + UPLOAD_PATH + format+"/" + newName;
                System.out.println("访问地址："+filePath);
                System.out.println("地址文件名："+newName);
                item.put("isUpload",true);
                item.put("url",filePath);
                fileListUploadStatus.put(originalFilename,item);
            } catch (IOException e) {
                item.put("isUpload",false);
                item.put("url","");
                fileListUploadStatus.put(originalFilename,item);
                e.printStackTrace();
            }
        }
        map.addAttribute("resultList",fileListUploadStatus);
        return map;
    }
}
