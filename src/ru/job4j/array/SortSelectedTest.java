package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort1() {
        int[] input = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort2() {
        int[] input = new int[] {56, 45, 9, 32, 15};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {9, 15, 32, 45, 56};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort3() {
        int[] input = new int[] {56, 56, 9, 32, 15};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {9, 15, 32, 56, 56};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort4() {
        int[] input = new int[] {543, 58, 666, 32, 150};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {32, 58, 150, 543, 666};
        assertThat(result, is(expect));
    }
}
