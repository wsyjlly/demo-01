package cn.wsyjlly.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @description ActiveMQ队列消息消费者
 * @author WANGJIHONG
 * @date 2018年3月25日 下午10:59:10
 * @Copyright 版权所有 (c) www.javalsj.com
 * @memo 无备注说明
 */
@Component
public class ActiveMQQueueConsumer {

    private final static Logger logger = LoggerFactory.getLogger(ActiveMQQueueConsumer.class);

    /**
     * WebSocket的Java老司机聊天室队列消息消费者
     */
    @JmsListener(destination = ActiveMQQueueConst.QUEUE_NAME_WEBSOCKET_CHATROOM_JAVALSJ, containerFactory = ActiveMQQueueConst.BEAN_NAME_JMSLISTENERCONTAINERFACTORY)
    public void receiveQueueWebSocketJavalsjChatroomMsg(String message) {
        logger.info("消费了一条队列{}消息{}。", ActiveMQQueueConst.QUEUE_NAME_WEBSOCKET_CHATROOM_JAVALSJ, message);
    }

}