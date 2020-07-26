package net.javaguides.springmvc.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
	    "net.javaguides.springmvc.controller"
	})
public  class WebMvcConfig extends  WebMvcConfigurerAdapter    {
	

}
