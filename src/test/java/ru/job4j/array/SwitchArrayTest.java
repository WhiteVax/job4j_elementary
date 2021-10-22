package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to10() {
        int[] input = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 9, 8, 7, 6, 5, 4, 3, 2, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to8() {
        int[] input = {8, 7, 6, 5, 4, 3, 2, 1};
        int source = 0;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 7, 6, 5, 4, 3, 8, 1};
        Assert.assertArrayEquals(expected, result);
    }
}
