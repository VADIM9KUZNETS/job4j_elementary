package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight() {
        double height = 175;
        double expected = 86.25;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double height = 165;
        double expected = 63.25;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);


    }
}

