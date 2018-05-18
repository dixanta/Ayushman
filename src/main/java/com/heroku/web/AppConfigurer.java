/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
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
       return new InternalResourceViewResolver("/WEB-INF/views/",".jsp");
   }
   
   @Bean
   public DataSource getDataSource(){
       String url="jdbc:postgresql://ec2-54-225-249-161.compute-1.amazonaws.com/da1jcvalb6i6r6?sslmode=require";
       String user="ufgtbvkwjsrjse";
       String password="92728b083a2e0b51be4e116281130f223d9f1d73c3e5a39cb38becd2fa68d477";
       return new DriverManagerDataSource(url, user, password);
   }
   
   @Bean
   public JdbcTemplate getJdbcTemplate(){
       return new JdbcTemplate(getDataSource());
   }
}
