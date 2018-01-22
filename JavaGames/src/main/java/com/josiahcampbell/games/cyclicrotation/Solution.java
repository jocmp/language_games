package com.josiahcampbell.games.cyclicrotation;

class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length > 0) {
            for (int rotation = 0; rotation < K; rotation++) {
                int last = A[A.length - 1];
                System.arraycopy(A, 0, A, 1, A.length - 1);
                A[0] = last;
            }
        }
        return A;
    }

    private String printList(int[] list) {
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (int i = 0; i < list.length - 1; i++)
            result.append(list[i]).append(", ");
        result.append(list[list.length - 1]).append("}");
        return result.toString();
    }
}
