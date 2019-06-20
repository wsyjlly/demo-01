package cn.wsyjlly;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo01ApplicationTests {

    @Test
    public void contextLoads() throws FileNotFoundException {
        //获取classes目录绝对路径

        String path = ClassUtils.getDefaultClassLoader().getResource("").getPath();
        System.out.println(path);

        String path2 = ResourceUtils.getURL("classpath:").getPath();

        System.out.println(path2);
        //输出目录:  /G:/outshine/wangsoso/target/classes/

        //如果上传目录为/static/images/upload/，则可以如下获取：
//        File upload = new File(path.getAbsolutePath(),"static/images/upload/");
//        if(!upload.exists()) upload.mkdirs();
//        System.out.println("upload url:"+upload.getAbsolutePath());
        //在开发测试模式时，得到的地址为：{项目跟目录}/target/static/images/upload/
        //在打包成jar正式发布时，得到的地址为：{发布jar包目录}/static/images/upload/
    }

}
