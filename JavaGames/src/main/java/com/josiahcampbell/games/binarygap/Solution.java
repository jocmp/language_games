package com.josiahcampbell.games.binarygap;

import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int N) {
        List<Character> number = Integer.toBinaryString(N).chars().mapToObj(x -> (char) x).collect(Collectors.toList());
        return  findBinaryGapCount(number, 0, 0);
    }

    private int findBinaryGapCount(List<Character> numbers, int currentGap, int longestGap) {
        if (numbers.isEmpty()) {
            return longestGap;
        } else if (numbers.get(0).equals('0')) {
            return findBinaryGapCount(numbers.subList(1, numbers.size()), currentGap + 1, longestGap);
        } else {
            return findBinaryGapCount(numbers.subList(1, numbers.size()), 0,  Math.max(currentGap, longestGap));
        }
    }
}