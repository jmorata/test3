package com.jmorata.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Profile("pro")
@Repository
public class DemoRepositoryPro implements DemoRepository {

    public List<String> findAll() {
        return Arrays.asList("Magenta", "Brown", "Yellow");
    }

}
