package com.jmorata;

import com.jmorata.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Demo implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(Demo.class);

    @Autowired
    private DemoService demoService;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Running DEV repository ...");

        List<String> myList = demoService.getAll();
        myList.forEach(logger::info);
    }

}
