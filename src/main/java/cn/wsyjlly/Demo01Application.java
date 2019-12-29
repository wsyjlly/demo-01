package cn.wsyjlly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


/*
* 哑舍 玄色 --name=晏沈威 --age=18
* */
@SpringBootApplication
@ServletComponentScan
@EnableScheduling
public class Demo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo01Application.class, args);
    }

}
