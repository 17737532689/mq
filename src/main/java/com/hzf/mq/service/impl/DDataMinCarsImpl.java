package com.hzf.mq.service.impl;


import com.hzf.mq.condition.DDataMinCarsCondition;
import com.hzf.mq.service.IDDataMinCars;
import com.hzf.mq.util.Message;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @param
 * @author yangchaojie
 * @return
 */
@Service
public class DDataMinCarsImpl extends BaseService implements IDDataMinCars {
    @Override
    public Message addDDataMinCar(HttpServletRequest request, DDataMinCarsCondition condition) {
        // TODO Auto-generated method stub
        Message message = new Message();

        return message;

    }


}
