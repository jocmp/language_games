package com.josiahcampbell.algos;

/**
 * Explanations at https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/sorting.html
 */
public class Sort {

    /**
     * The algorithm works by comparing each item in the list with the item next to it,
     * and swapping them if required. In other words, the largest element has bubbled to the top of the array.
     * The algorithm repeats this process until it makes a
     * pass all the way through the list without swapping any items.
     */
    public static void bubbleSort(int[] unsorted) {
        for (int i = unsorted.length - 1; i > -1; i--) {
            // j = position to bubble
            for (int j = 1; j <= i; j++) {
                // Swap if previous position is greater than current position
                if (unsorted[j] < unsorted[j - 1]) {
                    int temp = unsorted[j - 1];
                    unsorted[j - 1] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
    }

    /**
     * The selection sort works as follows: you look through the entire array
     * for the smallest element, once you find it you swap it (the smallest element)
     * with the first element of the array. Then you look for the smallest element
     * in the remaining array (an array without the first element) and swap it with
     * the second element. Then you look for the smallest element in the remaining array
     * (an array without first and second elements) and swap it with the third element, and so on.
     */
    public static void selectionSort(int[] unsorted) {
        for (int currentIndex = 0; currentIndex < unsorted.length - 1; currentIndex++) {
            int min = currentIndex;

            for (int nextIndex = currentIndex + 1; nextIndex < unsorted.length; nextIndex++) {
                if (unsorted[nextIndex] < unsorted[min]) {
                    min = nextIndex;
                }
            }
            int temp = unsorted[currentIndex];
            unsorted[currentIndex] = unsorted[min];
            unsorted[min] = temp;
        }
    }
}
