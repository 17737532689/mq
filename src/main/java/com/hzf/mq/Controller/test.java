package com.hzf.mq.Controller;

import com.hzf.mq.condition.DDataMinCarsCondition;
import com.hzf.mq.service.IRabbitSend;
import com.hzf.mq.util.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @param
 * @author yangchaojie
 * @return
 */
@Api(value = "min_data",tags = "min_data")
@Controller
@RequestMapping("/mq")
public class test {
   @Resource
    private ServiceFactory serviceFactory;
     @RequestMapping("/test")
     @ApiOperation(value = "kafka_produce_min",notes = "kafka_produce_min")
     public ModelAndView test(HttpServletRequest request, ModelMap map,@RequestBody DDataMinCarsCondition dataMinCarsCondition){

         Message message = this.serviceFactory.getiRabbitSend().sendToMQ(dataMinCarsCondition);

         map.put("200","success");

         return  new ModelAndView(new MappingJackson2JsonView(),map);
     }
}
