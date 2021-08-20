package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    public void createCar() {
        car = new Car("Skoda", "ABC-1234", 2019, "Vasili Naumov");
    }

    @Test
    void getManufacturer() {
        assertEquals("Skoda", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("ABC-1234", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("ABCD-1234");
        assertEquals("ABCD-1234", car.getNumber());
    }

    @Test
    void getYear() {
        assertEquals(2019, car.getYear());
    }

    @Test
    void getOwner() {
        assertEquals("Vasili Naumov", car.getOwner());
    }

    @Test
    void setOwner() {
        car.setOwner("Sergej Petrov");
        assertEquals("Sergej Petrov", car.getOwner());
    }

    @Test
    void getListOfOwners() {
        assertArrayEquals(new String[] {"Vasili Naumov"}, car.getOwners().toArray());
    }

    @Test
    void getListOfTwoOwners() {
        car.setOwner("Sergej Petrov");
        assertArrayEquals(new String[] {"Vasili Naumov", "Sergej Petrov"}, car.getOwners().toArray());
    }

    @Test
    public void testMethod() {

    }
}
