package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldTestTemp() {
        Conditioner conditioner = new Conditioner();
        assertEquals( 0, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(-100);
        assertEquals( 0, conditioner.getCurrentTemperature());
    }
}