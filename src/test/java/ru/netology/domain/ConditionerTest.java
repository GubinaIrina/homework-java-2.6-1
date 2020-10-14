package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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
        conditioner.increaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperatureUnderMax(){
        Conditioner conditioner = new Conditioner();
        int currentTemperature = 30;
        conditioner.increaseCurrentTemperatureUnderAndBeforeMax(currentTemperature);
        System.out.println(conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperatureBeforeMax(){
        Conditioner conditioner = new Conditioner();
        int currentTemperature = 29;
        conditioner.increaseCurrentTemperatureUnderAndBeforeMax(currentTemperature);
        System.out.println(conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.decreaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperatureUnderMin(){
        Conditioner conditioner = new Conditioner();
        int currentTemperature = 1;
        conditioner.decreaseCurrentTemperatureUnderAndBeforeMin(currentTemperature);
        System.out.println(conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperatureBeforeMin(){
        Conditioner conditioner = new Conditioner();
        int currentTemperature = 0;
        conditioner.decreaseCurrentTemperatureUnderAndBeforeMin(currentTemperature);
        System.out.println(conditioner.getCurrentTemperature());
    }
}