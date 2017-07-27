package com.springboot.controller;

import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController extends MySrart {
	
//	@Autowired
//	private Environment env;
	
	//public Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping("/")
	public String index(Map<String, Object> model){
		log.info("freemarker模板引入日志开始。。。。");
		log.info("spring.profiles.active:"+env.getProperty("server.port"));
	    model.put("time", new Date());  
	    model.put("message", "这是测试的内容。。。");  
	    model.put("toUserName", "张三");  
	    model.put("fromUserName", "李四"); 
	    log.info("freemarker模板引入日志结束。。。。");
		return "index";
	}

}
