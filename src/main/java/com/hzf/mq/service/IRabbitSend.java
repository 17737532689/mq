package com.hzf.mq.service;

import com.hzf.mq.condition.DDataMinCarsCondition;
import com.hzf.mq.util.Message;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public interface IRabbitSend {
    public Message sendToMQ(DDataMinCarsCondition condition);
}
