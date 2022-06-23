package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax33To22Then33() {
        int left = 33;
        int right = 22;
        int result = Max.max(left, right);
        int expected = 33;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax22To33Then33() {
        int left = 22;
        int right = 33;
        int result = Max.max(left, right);
        int expected = 33;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax33To33Then33() {
        int left = 33;
        int right = 33;
        int result = Max.max(left, right);
        int expected = 33;
        Assert.assertEquals(result, expected);
    }
}