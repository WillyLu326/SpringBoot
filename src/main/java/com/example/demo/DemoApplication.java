package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class DemoApplication {
	/**
	 *  Second way to inject servlet, filter, listener Willy Lu
	 */
	//implements ServletContextInitializer{
	
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		// TODO Auto-generated method stub
//		servletContext.addServlet("customServlet", CustomServlet.class).addMapping("/willylu");
//		servletContext.addFilter("customFilter", CustomFilter.class)
//			.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
//			//.addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST), true, "customServlet");
//		servletContext.addListener(new CustomListener());
//	}

	/**
	 *  The first way to inject servlet filter listener
	 */
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
