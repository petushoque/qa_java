package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionTest {

    Feline feline;

    private final String sex;
    private final boolean expectedHasMane;

    public LionTest(String sex, boolean expectedMane) {
        this.sex = sex;
        this.expectedHasMane = expectedMane;
    }

    @Parameterized.Parameters
    public static Object[][] lionGenders() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Другое", "Другое"},
        };
    }

    @Test
    public void doesHaveManeWorksCorrectly() throws Exception {
        Lion lion = new Lion(sex);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
    }
}