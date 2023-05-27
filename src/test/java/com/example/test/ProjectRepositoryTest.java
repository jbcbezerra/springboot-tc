package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.test.project.ProjectRepository;

@DataJpaTest
public class ProjectRepositoryTest implements TestDbContainerInitializer {
    @Autowired
    private ProjectRepository projectRepository;

    @Test
    public void tester() {
        assert 0 == projectRepository.findAll().size();
    }

}