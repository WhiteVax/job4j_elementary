package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP10K3then46875() {
<<<<<<<<< Temporary merge branch 1
        double expected = 4.6875;
        int p = 10;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.0001);
=========
        double expected = 4.687;
        int p = 10;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.001);
>>>>>>>>> Temporary merge branch 2
    }

    @Test
    public void whenP10K4then4() {
        int expected = 4;
        int p = 10;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }
}
