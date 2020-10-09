package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void setCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        int expected = 0;
        conditioner.setCurrentTemperature(expected);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void setCurrentTemperatureUnderMax(){
        Conditioner conditioner = new Conditioner();
        int expected = 31;
        conditioner.setCurrentTemperature(expected);
        assertNotEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void setCurrentTemperatureBeforeMin(){
        Conditioner conditioner = new Conditioner();
        int expected = -1;
        conditioner.setCurrentTemperature(expected);
        assertNotEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        int expected = 11;
        conditioner.increaseCurrentTemperature(expected);
        assertNotEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        int expected =12;
        conditioner.decreaseCurrentTemperature(expected);
        assertNotEquals(expected, conditioner.getCurrentTemperature());
    }
}