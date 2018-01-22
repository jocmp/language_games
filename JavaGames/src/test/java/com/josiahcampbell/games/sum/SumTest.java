package com.josiahcampbell.games.sum;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SumTest {

    @Test
    public void sum3() {
        assertArrayEquals(new int[]{-10, 2, 8}, Sum.sum3(new int[]{-25, -10, -7, -3, 2, 4, 8, 10}));
        assertArrayEquals(new int[]{-4, 1, 3}, Sum.sum3BinarySearch(new int[]{10, -999, 30, -4, -2, 1400, 1, 3}));
    }
}