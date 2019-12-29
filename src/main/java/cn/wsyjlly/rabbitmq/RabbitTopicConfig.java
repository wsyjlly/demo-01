package cn.wsyjlly.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wsyjlly
 * @create 2019.07.17 - 21:33
 **/
@Configuration
public class RabbitTopicConfig {
    public final static String TOPIC_NAME = "ysw-topic";
    @Bean
    Queue queue7(){
        return new Queue("queue-topic1");
    }

    @Bean
    Queue queue8(){
        return new Queue("queue-topic2");
    }

    @Bean
    Queue queue9(){
        return new Queue("queue-topic3");
    }

    @Bean
    TopicExchange topicExchange(){
        return new TopicExchange(TOPIC_NAME,true,false);
    }

    @Bean
    Binding binding7(){
         /*
         * 匹配规则
         * 绑定键binding key也必须是这种形式。以特定路由键发送的消息将会发送到所有绑定键与之匹配的队列中。但绑定键有两种特殊的情况：
         * 绑定键binding key也必须是这种形式。以特定路由键发送的消息将会发送到所有绑定键与之匹配的队列中。但绑定键有两种特殊的情况：
         * ①*（星号）仅代表一个单词
         * ②#（井号）代表任意个单词
         **/
        return BindingBuilder.bind(queue7()).to(topicExchange()).with("#.topic1");
    }

    @Bean
    Binding binding8(){
        return BindingBuilder.bind(queue8()).to(topicExchange()).with("topic2.#");
    }

    @Bean
    Binding binding9(){
        return BindingBuilder.bind(queue9()).to(topicExchange()).with("#.topic3.*");
    }
}
