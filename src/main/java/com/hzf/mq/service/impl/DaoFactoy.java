package com.hzf.mq.service.impl;

import com.hzf.mq.dao.DAttachmentResMapper;
import com.hzf.mq.dao.DDataMinCarsMapper;
import com.hzf.mq.dao.DResRealtimeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @param
 * @author yangchaojie
 * @return
 */
@Service
public class DaoFactoy {
    @Resource
    private DAttachmentResMapper dAttachmentResMapper;
    @Resource
    private DDataMinCarsMapper dDataMinCarsMapper;
    @Resource
    private DResRealtimeMapper dResRealtimeMapper;

    public DAttachmentResMapper getdAttachmentResMapper() {
        return dAttachmentResMapper;
    }

    public void setdAttachmentResMapper(DAttachmentResMapper dAttachmentResMapper) {
        this.dAttachmentResMapper = dAttachmentResMapper;
    }

    public DDataMinCarsMapper getdDataMinCarsMapper() {
        return dDataMinCarsMapper;
    }

    public void setdDataMinCarsMapper(DDataMinCarsMapper dDataMinCarsMapper) {
        this.dDataMinCarsMapper = dDataMinCarsMapper;
    }

    public DResRealtimeMapper getdResRealtimeMapper() {
        return dResRealtimeMapper;
    }

    public void setdResRealtimeMapper(DResRealtimeMapper dResRealtimeMapper) {
        this.dResRealtimeMapper = dResRealtimeMapper;
    }
}
