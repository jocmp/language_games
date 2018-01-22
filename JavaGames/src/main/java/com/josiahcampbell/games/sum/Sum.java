package com.josiahcampbell.games.sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sum {

    // time = O(N); space = O(N)
    static int[] sum3(int[] data) {
        Arrays.sort(data);
        Map<Integer, int[]> complements = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            complements.clear();
            for (int j = i + 1; j < data.length; j++) {
                if (complements.containsKey(data[j])) {
                    int[] pair = complements.get(data[j]);
                    return new int[]{pair[0], pair[1], data[j]};
                } else {
                    complements.put(-data[i] - data[j], new int[]{data[i], data[j]});
                }
            }
        }
        return new int[]{};
    }

    static int[] sum3BinarySearch(int[] data) {
        Arrays.sort(data);
        for (int i = 0; i < data.length - 3; i++) {
            int first = data[i];
            int start = i + 1;
            int end = data.length - 1;
            while (start < end) {
                int second = data[start];
                int third = data[end];
                if (first + second + third == 0) {
                    return new int[]{first, second, third};
                } else if (first + second + third > 0) {
                    end -= 1;
                } else {
                    start += 1;
                }
            }
        }

        return new int[]{};
    }
}
