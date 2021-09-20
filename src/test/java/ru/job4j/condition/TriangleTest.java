package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenExistFalse() {
        double ab = 2.0;
        double ac = 6.0;
        double bc = 2.0;
        boolean rezult = Triangle.exist(ab, bc, ac);
        Assert.assertFalse(rezult);
    }
}
