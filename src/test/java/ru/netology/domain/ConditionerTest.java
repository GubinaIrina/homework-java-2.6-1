package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void setCurrentTemperature(String test, int currentTemperature){
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(currentTemperature);
        System.out.println(conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        int actual = 15;
        conditioner.increaseCurrentTemperature(actual);
        System.out.println(conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        int actual = 15;
        conditioner.decreaseCurrentTemperature(actual);
        System.out.println(conditioner.getCurrentTemperature());
    }
}