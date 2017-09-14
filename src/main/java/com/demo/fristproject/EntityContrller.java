package com.demo.fristproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.EntityDemo;

@Controller
public class EntityContrller {
	private Logger logger = LoggerFactory.getLogger(EntityContrller.class);
	
	@RequestMapping(value="/zzp",method=RequestMethod.GET)
	@ResponseBody
	public EntityDemo zzp(){
		EntityDemo demo = new EntityDemo();
		demo.setAge("22");
		demo.setName("zzp");
		logger.debug("这是debug信息");
        logger.info("这是info信息");
        logger.warn("这是warn信息");
        logger.error("这是error信息");
		return demo;
	}
	

}
