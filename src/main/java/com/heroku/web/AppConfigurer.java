/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author USER
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.heroku.web")
public class AppConfigurer extends WebMvcConfigurerAdapter{
   @Bean
   public InternalResourceViewResolver getViewResolver(){
       return 
               new InternalResourceViewResolver("/WEB-INF/views/",".jsp");
   }
}
