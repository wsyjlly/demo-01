package cn.wsyjlly.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * @author wsyjlly
 * @create 2019.07.16 - 16:12
 **/
@Configuration
public class ActiveMQConfig {
    @Bean
    Queue queue(){
        return new ActiveMQQueue("amq");
    }

}
