package com.jmorata.configuration;

import com.jmorata.repository.DemoRepository;
import com.jmorata.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoServiceConfiguration {

    @Autowired
    DemoRepository demoRepository;

    @Bean
    public DemoService demoService() {
        return new DemoService(demoRepository);
    }

}
