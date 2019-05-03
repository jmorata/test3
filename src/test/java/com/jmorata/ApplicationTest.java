package com.jmorata;

import com.jmorata.repository.DemoRepository;
import com.jmorata.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class ApplicationTest {

    private List<String> demoList = Arrays.asList("Red", "Green", "Blue");

    @Autowired
    private DemoRepository demoRepository;

    @Autowired
    private DemoService demoService;

    @Test
    public void getAllDataService() {
        List<String> myList = demoService.getAll();
        assertEquals(myList, demoList);
    }

}