package com.ccff.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.ccff.ssm.*"})
@ImportResource({"classpath:resources/spring-config.xml","classpath:resources/spring-mvc.xml"})
@EnableTransactionManagement
public class ApplicationConfig {
}
