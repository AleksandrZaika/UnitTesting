package com.company;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    static Dog dog;

    @BeforeAll
    static void prepareData() {
        dog = new Dog("Albert", 2);
    }

    @org.junit.jupiter.api.Test
    void testGetName() {
        assertEquals("Albert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetName() {
        dog.setName("Roman");
        assertEquals("Albert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetNameIsEmpty() {
        Dog dog = new Dog("", 2);
        dog.setName("Roman");
        assertEquals("Roman", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testGetAge() {
    }

    @org.junit.jupiter.api.Test
    void testSetAge() {
    }
}