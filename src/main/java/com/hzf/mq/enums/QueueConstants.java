package com.hzf.mq.enums;

public enum QueueConstants {
    QUEUE_TEST1("queue_test_one", "队列1"),
    QUEUE_TEST2("queue_test_two", "队列2");
 
    String code;
    String desc;
 
    QueueConstants(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
 
    public String getCode() {
        return code;
    }
 
    public String getDesc() {
        return  desc;
    }
}