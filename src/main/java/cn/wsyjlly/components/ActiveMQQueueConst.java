package cn.wsyjlly.components;

/**
 * @description ActiveMQ队列常量
 * @author WANGJIHONG
 * @date 2018年3月25日 下午10:59:47
 * @Copyright 版权所有 (c) www.javalsj.com
 * @memo 无备注说明
 */
public class ActiveMQQueueConst {

    /** 
     * 在Queue模式中，对消息的监听需要对containerFactory进行配置，工厂标识
     */ 
    public static final String BEAN_NAME_JMSLISTENERCONTAINERFACTORY = "queueJmsListenerContainerFactory";    
    
    /**
     * 队列消息标识_WebSocket的Java老司机聊天室
     */
    public static final String QUEUE_NAME_WEBSOCKET_CHATROOM_JAVALSJ = "queue.websocket.chatroom.javalsj";

}