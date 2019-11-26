package com.hzf.mq.service;

import com.hzf.mq.util.Message;

import java.io.FileNotFoundException;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public interface IRabbitmqConsumer {
    public Message processQueue13(String data) throws FileNotFoundException;
}
