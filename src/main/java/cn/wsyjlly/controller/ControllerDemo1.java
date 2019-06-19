package cn.wsyjlly.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

/**
 * @author wsyjlly
 * @create 2019.06.10 - 19:00
 **/
@RestController
public class ControllerDemo1 {
    @RequestMapping("/demo")
    public void demo(){
        Properties properties = System.getProperties(); //遍历所有的属性
        for (String key : properties.stringPropertyNames()) { //输出对应的键和值
            System.out.println(key + "=" + properties.getProperty(key));
        }
    }
    
}
