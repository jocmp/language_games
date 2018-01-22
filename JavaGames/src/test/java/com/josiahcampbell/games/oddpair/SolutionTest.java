package com.josiahcampbell.games.oddpair;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        assertEquals(new Solution().solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }), 7);
        assertEquals(new Solution().solution(new int[] { 9, 9, 9, 9, 9 }), 9);
        assertEquals(new Solution().solution(new int[] { 1, 3, 3, 2, 1 }), 2);
        assertEquals(new Solution().solution(new int[] { 3, 1, 3 }), 1);
    }
}