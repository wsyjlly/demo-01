package cn.wsyjlly.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.HeadersExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


/**
 * @author wsyjlly
 * @create 2019.07.17 - 21:33
 **/
@Configuration
public class RabbitHeaderConfig {
    public final static String HEADER_NAME = "ysw-header";
    @Bean
    Queue queue10(){
        return new Queue("queue-header1");
    }

    @Bean
    Queue queue11(){
        return new Queue("queue-header2");
    }

    @Bean
    Queue queue12(){
        return new Queue("queue-header3");
    }

    @Bean
    HeadersExchange headersExchange(){
        return new HeadersExchange(HEADER_NAME,true,false);
    }

    @Bean
    Binding binding10(){
        Map<String,Object> map = new HashMap<>();
        map.put("age", "18");
        map.put("name", "ysw");
        return BindingBuilder.bind(queue10()).to(headersExchange()).whereAny(map).match();
    }

    @Bean
    Binding binding11(){
        Map<String,Object> map = new HashMap<>();
        map.put("name", "ysw");
        return BindingBuilder.bind(queue11()).to(headersExchange()).where("age").exists();
    }

    @Bean
    Binding binding12(){
        Map<String,Object> map = new HashMap<>();
        map.put("age", "18");
        map.put("name", "ysw");
        return BindingBuilder.bind(queue12()).to(headersExchange()).whereAll(map).match();
    }
}
