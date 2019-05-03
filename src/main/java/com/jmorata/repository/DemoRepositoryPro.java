package com.jmorata.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Profile("pro")
@Repository
public class DemoRepositoryPro implements DemoRepository {

    public List<String> findAll() {
        List<String> myList = new ArrayList<>();
        myList.add("Magenta");
        myList.add("Brown");
        myList.add("Yellow");

        return myList;
    }

}
