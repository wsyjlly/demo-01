package cn.wsyjlly.components;

/**
 * @description ActiveMQ主题常量 
 * @author WANGJIHONG
 * @date 2018年3月25日 下午11:24:09 
 * @Copyright 版权所有 (c) www.javalsj.com
 * @memo 无备注说明
 */
public class ActiveMQTopicConst {
    
    /** 
     * 在Topic模式中，对消息的监听需要对containerFactory进行配置，工厂标识
     */ 
    public static final String BEAN_NAME_JMSLISTENERCONTAINERFACTORY = "topicJmsListenerContainerFactory";    
    
    /**
     * 主题消息标识_WebSocket的系统公告
     */
    public static final String TOPIC_NAME_WEBSOCKET_SYSTEM_NOTICE = "topic.websocket.system.notice";
}