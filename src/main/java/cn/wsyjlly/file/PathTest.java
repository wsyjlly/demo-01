package cn.wsyjlly.file;

import java.io.File;

/**
 * @author wsyjlly
 * @create 2019.07.16 - 17:59
 **/
public class PathTest {
    public static void main(String[] args) {
        System.out.println(new File("./uploadFiles/abc.gif").exists());
    }
}
