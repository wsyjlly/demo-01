package cn.wsyjlly.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;

/**
 * @description 测试
 * @author WANGJIHONG
 * @date 2018年3月25日 下午11:41:03
 * @Copyright 版权所有 (c) www.javalsj.com
 * @memo 无备注说明 
 */
@Component
public class ActiveMQTest {

    @Autowired
    private ActiveMQQueueProducer activeMQQueueProducer;

    @Autowired
    private ActiveMQTopicPublisher activeMQTopicPublisher;

//    @Scheduled(fixedRate = 10000, initialDelay = 3000)
    public void test() {
        activeMQQueueProducer.sendMsg(ActiveMQQueueConst.QUEUE_NAME_WEBSOCKET_CHATROOM_JAVALSJ,
                "队列message" + Instant.now().toString());
        activeMQTopicPublisher.publishMsg(ActiveMQTopicConst.TOPIC_NAME_WEBSOCKET_SYSTEM_NOTICE,
                "主题message" + Instant.now().toString());
    }

}