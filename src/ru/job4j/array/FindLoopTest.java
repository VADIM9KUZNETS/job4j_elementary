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
    @Test
    public void whenArrayHas34Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {11, 45, 34};
        int value = 12;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind0() {
        int[] input = new int[] {7, 3, 9, 1, 6};
        int value = 9;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind1() {
        int[] input = new int[] {7, 3, 9, 1, 6, 8, 15, 23, 76, 2};
        int value = 15;
        int start = 2;
        int finish = 8;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 1;
        assertThat(result, is(expect));
    }



}
