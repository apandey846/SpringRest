package com.abhi.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Scanner;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.abhi.spring")
public class AppConfig {
}