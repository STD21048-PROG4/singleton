package com.example.prog4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassUniqueInstanceTest {
    @Test
    public void testUniqueInstance() {
        ClassUniqueInstance instance1 = ClassUniqueInstance.getInstance();
        ClassUniqueInstance instance2 = ClassUniqueInstance.getInstance();

        assertEquals(instance1, instance2);
    }

    @Test
    public void testUniqueInstanceClick() {
        ClassUniqueInstance instance = ClassUniqueInstance.getInstance();

        instance.setClick(10);
        assertEquals(10, instance.getClick());

        instance.setClick(20);
        assertEquals(20, instance.getClick());
    }
}
