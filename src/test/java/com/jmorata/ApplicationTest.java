package com.jmorata;

import com.jmorata.repository.DemoRepository;
import com.jmorata.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    private List<String> demoList=Arrays.asList("demo");

    @MockBean
    private DemoRepository demoRepository;

    @Autowired
    DemoService demoService;

    @Test
    public void getAllDataService() {
        when(demoRepository.findAll()).thenReturn(demoList);

        List<String> myList=demoService.getAll();
        assertEquals(myList,demoList);
    }

}