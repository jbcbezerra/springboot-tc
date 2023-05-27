package com.example.test;

import org.testcontainers.containers.MySQLContainer;

public class TestDbContainer extends MySQLContainer<TestDbContainer> {
    public static final String IMAGE_VERSION = "mysql:8.0.33";
    public static TestDbContainer container;

    private TestDbContainer() {
        super(IMAGE_VERSION);
    }

    public static TestDbContainer getInstance() {
        if (container == null) {
            container = new TestDbContainer();
        }
        return container;
    }

    @Override
    public void stop() {
        // Don't stop between Tests. Keep Container running. Let JVM handle shut down after all Tests has been run
    }
}
