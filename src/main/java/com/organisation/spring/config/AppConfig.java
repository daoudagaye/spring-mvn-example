package com.organisation.spring.config;

import com.organisation.spring.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(value = {"com.organisation.spring"})
public class AppConfig {
    @Bean
    public UserService getUserService() {
        return new UserService();
    }
}
