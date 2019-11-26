package com.hzf.mq.MQ;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
@Controller
@RequestMapping("/mq")
public class test {
    @Resource
    private RabbitSend rabbitSend;

     @RequestMapping("/test")
     public ModelAndView test(HttpServletRequest request, ModelMap map){

         rabbitSend.sendToMQ();

         map.put("200","success");

         return  new ModelAndView(new MappingJackson2JsonView(),map);
     }
}
