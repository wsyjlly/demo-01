package cn.wsyjlly.file;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author wsyjlly
 * @create 2019.06.18 - 18:54
 **/
public class FilePath {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        * 获取当前路径
        * */
        System.out.println("user.dir:"+System.getProperty("user.dir"));
        System.out.println("user.home:"+System.getProperty("user.home"));
        System.out.println("java.class.path:"+System.getProperty("java.class.path"));
        System.out.println("sun.java.command:"+System.getProperty("sun.java.command"));
        /*Properties properties = System.getProperties(); //遍历所有的属性
        for (String key : properties.stringPropertyNames()) { //输出对应的键和值
            System.out.println(key + "=" + properties.getProperty(key));
        }*/
        System.out.println(new File("").getPath());
        System.out.println(new File("").getAbsolutePath());
        System.out.println(new File("/").getParent());
        System.out.println(new File("/uploadFiles").getAbsolutePath());
        File file = new File("/data/uploadFiles");
        if(!file.exists()){//如果文件夹不存在
            file.mkdirs();//创建文件夹
        }




//        String path = ClassUtils.getDefaultClassLoader().getResource("").getPath();
//        System.out.println(path);
//
//        String path2 = ResourceUtils.getURL("classpath:").getPath();
//
//        System.out.println(path2);

        File upload = new File(System.getProperty("user.dir"),"uploadFiles");
        if(!upload.exists()) upload.mkdirs();
        System.out.println("upload url:"+upload.getAbsolutePath());
    }
}
