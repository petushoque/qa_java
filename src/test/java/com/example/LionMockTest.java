package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensWorksCorrectly() throws Exception {

        Lion lion = new Lion("Самка");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittensCount = lion.getKittens();
        int expectedKittensCount = 1;
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getFoodWorksCorrectly() throws Exception {

        Lion lion = new Lion("Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualFood = lion.getFood();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyWorksCorrectly() throws Exception {

        Lion lion = new Lion("Самка");
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        Assert.assertEquals(expectedFamily, actualFamily);
    }
}
