package cn.wsyjlly.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author wsyjlly
 * @create 2019.06.14 - 19:36
 * 配置启动系统参数
 **/
@Component
@Order(2)
public class MyCommandLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner2:"+Arrays.toString(args));
        System.out.println("——————————————————————");
    }
}
