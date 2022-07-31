package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DashaMapThreeTest {
    DashaMapThree mapThree;

    @BeforeEach
    public void init() {
        mapThree = new DashaMapThree();
    }

    @Test
    public void hashTest() {
        Integer expected = 1;

        Integer actual = mapThree.hash("ab");

        Assert.assertEquals(expected, actual);
    }
}
