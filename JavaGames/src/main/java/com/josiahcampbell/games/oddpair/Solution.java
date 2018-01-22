package com.josiahcampbell.games.oddpair;

public class Solution {
    public int solution(int[] A) {
        int result = 0;
        for (int i : A) {
           result ^= i;
        }
        return result;
    }
}
