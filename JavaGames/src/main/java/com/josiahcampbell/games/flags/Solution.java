package com.josiahcampbell.games.flags;

public class Solution {
    public int solution(int[] A) {
        int N = A.length;
        int[] next = nextPeak(A);
        int i = 1;
        int result = 0;

        while ((i - 1) * i <= N) {
            int position = 0;
            int number = 0;
            while (position < N && number < i) {
                position = next[position];
                if (position == -1) {
                    break;
                }
                number += 1;
                position += 1;
            }
            result = Math.max(result, number);
            i += 1;
        }
        return result;
    }

    private int[] nextPeak(int[] A) {
        int N = A.length;
        boolean[] peaks = createPeaks(A);
        int[] next = new int[N];
        next[N - 1] = -1;
        for (int i = N - 2; i > -1; i--) {
            if (peaks[i]) {
                next[i] = i;
            } else {
                next[i] = next[i + 1];
            }
        }

        return next;
    }

    private boolean[] createPeaks(int[] A) {
        int N = A.length;
        boolean[] peaks = new boolean[N];

        for (int i = 1; i < N - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peaks[i] = true;
            }
        }

        return peaks;
    }
}
