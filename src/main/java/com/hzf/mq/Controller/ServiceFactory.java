package com.hzf.mq.Controller;


import com.hzf.mq.service.IDDataMinCars;
import com.hzf.mq.service.IDResRealtime;
import com.hzf.mq.service.IRabbitSend;
import com.hzf.mq.service.IRabbitmqConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @param
 * @author yangchaojie
 * @return
 */
@Service
public class ServiceFactory {

    @Autowired
    private IDDataMinCars idDataMinCars;
    @Autowired
    private IDResRealtime idResRealtime;
    @Autowired
    private IRabbitSend iRabbitSend;
    @Autowired
    private IRabbitmqConsumer iRabbitmqConsumer;

    public IRabbitSend getiRabbitSend() {
        return iRabbitSend;
    }

    public void setiRabbitSend(IRabbitSend iRabbitSend) {
        this.iRabbitSend = iRabbitSend;
    }

    public IRabbitmqConsumer getiRabbitmqConsumer() {
        return iRabbitmqConsumer;
    }

    public void setiRabbitmqConsumer(IRabbitmqConsumer iRabbitmqConsumer) {
        this.iRabbitmqConsumer = iRabbitmqConsumer;
    }

    public IDDataMinCars getIdDataMinCars() {
        return idDataMinCars;
    }

    public void setIdDataMinCars(IDDataMinCars idDataMinCars) {
        this.idDataMinCars = idDataMinCars;
    }

    public IDResRealtime getIdResRealtime() {
        return idResRealtime;
    }

    public void setIdResRealtime(IDResRealtime idResRealtime) {
        this.idResRealtime = idResRealtime;
    }
}
