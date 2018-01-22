package com.josiahcampbell.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void indexOf() {
        List<String> flowers = new ArrayList<String>(Arrays.asList("marigold", "periwinkle", "hyssop", "vinca"));
        assertEquals(2, new BinarySearch<String>().indexOf(flowers, "hyssop"));
    }

    @Test
    public void search() {
        int[] numbers = new int[] { 1000, 2000, 3400, 4000, 5000 };
        assertEquals(3, new BinarySearch<Integer>().search(numbers, 4000));
        assertEquals(-1, new BinarySearch<Integer>().search(numbers, 6400));
    }
}