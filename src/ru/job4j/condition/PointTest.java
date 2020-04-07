package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class PointTest {
    @Test
    public void distance() {
        double x1  = 7;
        double x2  = -8;
        double y1  = 4;
        double y2  = 0;
        double expected = 8.54400374531753;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
