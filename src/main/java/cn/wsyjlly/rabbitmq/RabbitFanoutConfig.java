package cn.wsyjlly.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wsyjlly
 * @create 2019.07.17 - 21:33
 **/
@Configuration
public class RabbitFanoutConfig {
    public final static String FANOUT_NAME = "ysw-fanout";

    @Bean
    Queue queue4(){
        return new Queue("queue-fanout1");
    }

    @Bean
    Queue queue5(){
        return new Queue("queue-fanout2");
    }

    @Bean
    Queue queue6(){
        return new Queue("queue-fanout3");
    }

    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange(FANOUT_NAME,true,false);
    }

    @Bean
    Binding binding4(){
        return BindingBuilder.bind(queue4()).to(fanoutExchange());
    }

    @Bean
    Binding binding5(){
        return BindingBuilder.bind(queue5()).to(fanoutExchange());
    }

    @Bean
    Binding binding6(){
        return BindingBuilder.bind(queue6()).to(fanoutExchange());
    }
}
