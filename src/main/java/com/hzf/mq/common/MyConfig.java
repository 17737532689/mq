package com.hzf.mq.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "application")
public class MyConfig {

    /**
     * 版本
     */
    private String version;
    /**
     * 上传文件路径
     */
    private static String profile;


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public static String getProfile() {
        return profile;
    }

    public static void setProfile(String profile) {
        MyConfig.profile = profile;
    }
}
