package com.josiahcampbell.games.flags;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    public void solution() {
        assertEquals(3, new Solution().solution(new int[] { 1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 }));
        assertEquals(1, new Solution().solution(new int[] { 1, 2, 1 }));
        assertEquals(1, new Solution().solution(new int[] { 1, 2, 3, 1 }));
        assertEquals(2, new Solution().solution(new int[] { 1, 2, 3, 1, 4, 1 }));
        assertEquals(0, new Solution().solution(new int[] { 1 }));
        assertEquals(0, new Solution().solution(new int[] { 1, 2 }));
        assertEquals(0, new Solution().solution(new int[] { 0 }));
    }
}