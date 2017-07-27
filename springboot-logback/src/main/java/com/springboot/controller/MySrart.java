package com.springboot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;

/**
 * 启动类
 * @author jiangzhou
 *
 */
public class MySrart implements CommandLineRunner {
	
	@Autowired
	public Environment env;
	
	public Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public void run(String... arg0) throws Exception {
		log.info("自定义启动类：加载日志，配置文件属性");
	}

}
