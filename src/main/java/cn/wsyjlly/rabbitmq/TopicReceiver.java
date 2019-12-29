package cn.wsyjlly.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author wsyjlly
 * @create 2019.07.17 - 21:42
 **/
@Component
public class TopicReceiver {
    Logger logger= LoggerFactory.getLogger(getClass());

    @RabbitListener(queues = "queue-topic1")
    public void topicHandler1(String msg){
        logger.info("\033[32;4m"+"queue-topic1:"+msg+"\033[0m");
    }

    @RabbitListener(queues = "queue-topic2")
    public void topicHandler2(String msg){
        logger.info("\033[32;4m"+"queue-topic2:"+msg+"\033[0m");
    }

    @RabbitListener(queues = "queue-topic3")
    public void topicHandler3(String msg){
        logger.info("\033[32;4m"+"queue-topic3:"+msg+"\033[0m");
    }
}
