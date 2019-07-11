package cn.wsyjlly.file;


import java.io.File;
import java.io.IOException;

/**
 * @author wsyjlly
 * @create 2019.06.18 - 18:54
 **/
public class FileOperator {
    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.dir")+"/uploadFiles/abc.gif");
//        boolean exists = file.exists();
//        if (exists){
//            if (file.delete()){
//                System.out.println("删除成功！");
//            }
//        }
        getMessage(new File(System.getProperty("user.dir")+"/uploadFiles/abc.gif"));
        getMessage(new File(System.getProperty("user.dir")+"/uploadFiles"));
        getMessage(new File(System.getProperty("user.dir")+"/uploadFiles/abd.gif"));
        getMessage(new File("uploadFiles/abc.gif"));
        getMessage(new File("uploadFiles/abg.gif"));

        getMessage2(new File(System.getProperty("user.dir")+"/uploadFiles/abc.gif"));
        getMessage2(new File(System.getProperty("user.dir")+"/uploadFiles/abd.gif"));
        getMessage2(new File("./uploadFiles/abc.gif"));

        FileOperators.addFile(new File("./uploadFiles/abc.gif"));

    }
    private static void getMessage(File file){
        System.out.println("文件路径："+file.getAbsolutePath());
        System.out.println("文件名："+file.getName());
        System.out.println("是否存在："+file.exists());
        System.out.println("是否是文件夹："+file.isDirectory());
        System.out.println("是否是文件："+file.isFile());
        System.out.println("是否是隐藏文件："+file.isHidden());
        System.out.println("是否是绝对路径："+file.isAbsolute());
        System.out.println("---------------------------------------------");
    }
    private static void getMessage2(File file) throws IOException {
        System.out.println("文件名："+file.getName());
        System.out.println("文件路径："+file.getPath());
        System.out.println("绝对路径："+file.getAbsolutePath());
        System.out.println("规范路径："+file.getCanonicalPath());
        System.out.println("规范文件路径："+file.getCanonicalFile());
        System.out.println("当前文件夹路径："+file.getParent());
        System.out.println("当前文件夹路径："+file.getParentFile());
        System.out.println("是否是隐藏文件："+file.getAbsoluteFile());
        System.out.println("剩余空间大小："+file.getFreeSpace());
        System.out.println("总空间大小："+file.getTotalSpace());
        System.out.println("未使用空间大小："+file.getUsableSpace());
        System.out.println("--------------------------------------------------------------------------------");
    }
    public static class FileOperators{
        public static Boolean addFile(File file){
            System.out.println(file.toPath());
            System.out.println(file.toURI());
            return null;
        }
        public Boolean deleteFile(File file){
            return null;
        }
        public Boolean updateFile(File file){
            return null;
        }
    }
}
