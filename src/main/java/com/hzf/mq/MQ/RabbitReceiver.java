package com.hzf.mq.MQ;

import org.springframework.stereotype.Component;

/**
 * @param
 * @author yangchaojie
 * @return
 */
@Component
public class RabbitReceiver {
  /* @RabbitListener(queues = "hello-queue")
    public void handler1(String msg){
        System.out.println("监听"+msg);
    }*/
}
