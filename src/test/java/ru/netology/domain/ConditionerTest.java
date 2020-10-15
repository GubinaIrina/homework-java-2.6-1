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
    void increaseCurrentTemperatureBeforeMax(){
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(29);
        conditioner.increaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
    }
    @Test
    void increaseCurrentTemperatureUnderMax(){
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
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
        conditioner.setCurrentTemperature(1);
        conditioner.decreaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
    }
    @Test
    void decreaseCurrentTemperatureBeforeMin(){
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(0);
        conditioner.decreaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
    }

}