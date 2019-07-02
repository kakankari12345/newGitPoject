package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import ch.qos.logback.core.net.SyslogOutputStream;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GtiProjectApplication.class);
	}
	public static void sample2() {
		System.out.println("welcome github project");
	}

}
