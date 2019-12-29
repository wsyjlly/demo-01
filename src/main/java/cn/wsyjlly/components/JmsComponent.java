package cn.wsyjlly.components;

import cn.wsyjlly.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;


/**
 * @author wsyjlly
 * @create 2019.07.16 - 16:15
 **/
@Component
public class JmsComponent {
    @Autowired
    JmsMessagingTemplate messagingTemplate;
    @Autowired
    Queue queue;
    public void send(Message msg){
        messagingTemplate.convertAndSend(this.queue, msg);
    }

    @JmsListener(destination = "amq")
    public void receive(Message msg){
        System.out.println("receive:"+msg);
    }
}
