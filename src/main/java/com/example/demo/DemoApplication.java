package com.example.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;

@SpringBootApplication
public class DemoApplication implements ServletContextInitializer{
	
	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

//	@Bean
//	public ServletRegistrationBean servletRegistrationBean() {
//		return new ServletRegistrationBean(new CustomServlet(), "/willy");
//	}
//	
//	@Bean
//	public FilterRegistrationBean filterRegistrationBean() {
//		/**
//		 *  Filter all requests
//		 */
//		//return new FilterRegistrationBean(new CustomFilter());
//		/**
//		 *  Filter specific servlet
//		 */
//		return new FilterRegistrationBean(new CustomFilter(), servletRegistrationBean());
//	}
//	
//	@Bean
//	public ServletListenerRegistrationBean<CustomListener> servletListenerRegistrationBean() {
//		return new ServletListenerRegistrationBean<CustomListener>(new CustomListener());
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
