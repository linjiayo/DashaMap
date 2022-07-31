package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {
    DashaMapOne mapOne;
    @BeforeEach
    public void init() {
        mapOne = new DashaMapOne();
    }

    @Test
    public void testIsEmpty() {
        Boolean actual = mapOne.isEmpty();

        Assert.assertTrue(actual);
    }

    @Test
    public void testHash() {
        Integer expected = 1;

        Integer actual = mapOne.hash("bcd");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSet() {
        mapOne.set("abc", 2);
        mapOne.set("ajhe", 3);
        Integer expectedSize = 2;
        Integer expectedVal = 2;

        Integer actualVal = mapOne.get("abc");
        Integer actualSize = mapOne.bucketSize("abc");

        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertEquals(expectedVal, actualVal);
    }


}
