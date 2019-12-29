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
public class FanoutReceiver {
    Logger logger= LoggerFactory.getLogger(getClass());

    @RabbitListener(queues = "queue-fanout1")
    public void fanoutHandler1(String msg){
        logger.info("\033[31;4m"+"queue-fanout1:"+msg+"\033[0m");
    }

    @RabbitListener(queues = "queue-fanout2")
    public void fanoutHandler2(String msg){
        logger.info("\033[31;4m"+"queue-fanout2:"+msg+"\033[0m");
    }

    @RabbitListener(queues = "queue-fanout3")
    public void fanoutHandler3(String msg){
        logger.info("\033[31;4m"+"queue-fanout3:"+msg+"\033[0m");
    }
}
