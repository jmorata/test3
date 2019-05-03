package com.jmorata.service;

import com.jmorata.repository.DemoRepository;

import java.util.List;

public class DemoService {

    private DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public List<String> getAll() {
        return demoRepository.findAll();
    }

}
