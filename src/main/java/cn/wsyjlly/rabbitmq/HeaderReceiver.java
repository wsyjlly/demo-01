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
public class HeaderReceiver {
    Logger logger= LoggerFactory.getLogger(getClass());

    @RabbitListener(queues = "queue-header1")
    public void headerHandler1(byte[] msg){
        logger.info("\033[33;4m"+"queue-header1:"+new String(msg,0,msg.length)+"\033[0m");
    }

    @RabbitListener(queues = "queue-header2")
    public void headerHandler2(byte[] msg){
        logger.info("\033[33;4m"+"queue-header2:"+new String(msg,0,msg.length)+"\033[0m");
    }

    @RabbitListener(queues = "queue-header3")
    public void headerHandler3(byte[] msg){
        logger.info("\033[33;4m"+"queue-header3:"+new String(msg,0,msg.length)+"\033[0m");
    }
}
