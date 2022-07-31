package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DashaMapTwoTest {
    DashaMapTwo mapTwo;

    @BeforeEach
    public void init() {
        mapTwo = new DashaMapTwo();
    }

    @Test
    public void testHash() {
        Integer expected = 2;

        Integer actual = mapTwo.hash("bc");

        Assert.assertEquals(expected, actual);
    }
}
