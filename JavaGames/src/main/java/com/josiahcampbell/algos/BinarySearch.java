package com.josiahcampbell.algos;

import java.util.List;

public class BinarySearch<T extends Comparable<T>> {

    public int indexOf(List<T> elements, T searchElement) {
        int low = 0;
        int high = elements.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (elements.get(mid).equals(searchElement)) {
                return mid;
            } else if (elements.get(mid).compareTo(searchElement) > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


    public int search(int[] elements, int element) {
        int low = 0;
        int high = elements.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (elements[mid] == element) {
                return mid;
            } else if (elements[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
