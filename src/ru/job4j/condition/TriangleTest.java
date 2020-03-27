package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(3.6, 3.9, 3.2);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(1.0, 2.0, 3.0);
        assertThat(result, is(false));
    }
}
