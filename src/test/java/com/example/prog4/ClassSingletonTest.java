package com.example.prog4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassSingletonTest {
    @Test
    public void testSingletonInstance() {
        ClassSingleton singleton1 = ClassSingleton.getInstance();
        ClassSingleton singleton2 = ClassSingleton.getInstance();

        assertEquals(singleton1, singleton2);
    }

    @Test
    public void testSingletonDescription() {
        ClassSingleton singleton = ClassSingleton.getInstance();

        singleton.setDescription("New description");
        assertEquals("New description", singleton.getDescription());

        singleton.setDescription("Updated description");
        assertEquals("Updated description", singleton.getDescription());
    }
}
