package cn.wsyjlly.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;
import java.util.Set;

/**
 * @author wsyjlly
 * @create 2019.06.14 - 19:39
 * 配置启动系统参数
 **/
@Component
@Order(1)
public class MyApplicationRunner1 implements ApplicationRunner {
//    @Value("${spring.resources.static-locations}")
//    private String location;


    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println(location);
        File upload = new File(System.getProperty("user.dir"),"uploadFiles");
        if(!upload.exists()) upload.mkdirs();
        System.out.println("upload url:"+upload.getAbsolutePath());



        /*File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) {
            path = new File("");
        }
        System.out.println(path);
        File upload2 = new File(path.getAbsolutePath(),"upload/");
        if(!upload.exists()) {
            upload2.mkdirs();
        }
        System.out.println("upload2 url:"+upload2.getAbsolutePath());*/


        
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("1-nonOptionArgs:"+nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        for (String item:optionNames){
            System.out.println("1-Key:"+item+";value:"+args.getOptionValues(item));
        }
    }
}
