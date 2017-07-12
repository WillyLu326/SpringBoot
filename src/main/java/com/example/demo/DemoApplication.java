package com.example.demo;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import com.example.demo.util.filter.CustomFilter;
import com.example.demo.util.listener.CustomListener;
import com.example.demo.util.servlet.CustomServlet;

@SpringBootApplication
public class DemoApplication implements ServletContextInitializer{
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		servletContext.addServlet("customServlet", CustomServlet.class).addMapping("/willylu");
		servletContext.addFilter("customFilter", CustomFilter.class)
			.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
			//.addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST), true, "customServlet");
		servletContext.addListener(new CustomListener());
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
