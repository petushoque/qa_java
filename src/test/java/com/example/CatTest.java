package com.example;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void getSoundWorksCorrectly() {

        Cat cat = new Cat(new Feline());
        String actualSound = cat.getSound();
        String expectedSound = "Мяу";
        Assert.assertEquals(expectedSound, actualSound);
    }
}