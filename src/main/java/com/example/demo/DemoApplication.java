package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.demo.util.filter.CustomFilter;
import com.example.demo.util.listener.CustomListener;
import com.example.demo.util.servlet.CustomServlet;

@SpringBootApplication
public class DemoApplication {

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		return new ServletRegistrationBean(new CustomServlet(), "/willy");
	}
	
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		/**
		 *  Filter all requests
		 */
		//return new FilterRegistrationBean(new CustomFilter());
		/**
		 *  Filter specific servlet
		 */
		return new FilterRegistrationBean(new CustomFilter(), servletRegistrationBean());
	}
	
	@Bean
	public ServletListenerRegistrationBean<CustomListener> servletListenerRegistrationBean() {
		return new ServletListenerRegistrationBean<CustomListener>(new CustomListener());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
