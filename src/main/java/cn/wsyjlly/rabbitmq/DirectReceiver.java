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
public class DirectReceiver {
    Logger logger= LoggerFactory.getLogger(getClass());

    @RabbitListener(queues = "queue-direct1")
    public void directHandler1(String msg){
        logger.info("\033[30;4m"+"queue-direct1:"+msg+"\033[0m");
    }

    @RabbitListener(queues = "queue-direct2")
    public void directHandler2(String msg){
        logger.info("\033[30;4m"+"queue-direct2:"+msg+"\033[0m");
    }

    @RabbitListener(queues = "queue-direct3")
    public void directHandler3(String msg){
        logger.info("\033[30;4m"+"queue-direct3:"+msg+"\033[0m");
    }
}
