package com.hzf.mq.service;



import com.hzf.mq.condition.DDataMinCarsCondition;
import com.hzf.mq.util.Message;

import javax.servlet.http.HttpServletRequest;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public interface IDDataMinCars {

    /**
     * 添加分钟数据
     * @param
     * @return
     * @throws
     */
    public Message addDDataMinCar(HttpServletRequest request, DDataMinCarsCondition condition) ;
}
