package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 10;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas12Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {12, 54, 99};
        int value = 10;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas11Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {11, 45, 34};
        int value = 11;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

}
