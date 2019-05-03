package com.jmorata.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Profile("dev")
@Repository
public class DemoRepositoryDev implements DemoRepository {

    public List<String> findAll() {
        List<String> myList = new ArrayList<>();
        myList.add("Red");
        myList.add("Green");
        myList.add("Blue");

        return myList;
    }

}
