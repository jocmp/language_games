package com.josiahcampbell.algos;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void bubbleSort() {
        int[] numbers = generateUnsorted();
        int[] sortedNumbers = copyAndSort(numbers);

        Sort.bubbleSort(numbers);

        assertArrayEquals(sortedNumbers, numbers);
    }

    @Test
    public void selectionSort() {
        int[] numbers = generateUnsorted();
        int[] sortedNumbers = copyAndSort(numbers);

        Sort.selectionSort(numbers);
        assertArrayEquals(sortedNumbers, numbers);
    }


    private int[] copyAndSort(int[] numbers) {
        int [] copiedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copiedNumbers);
        return copiedNumbers;
    }

    private int[] generateUnsorted() {
        Random random = new Random();
        int size = random.nextInt(10_000);
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(999_999);
        }
        return numbers;
    }
}