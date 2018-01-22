package com.josiahcampbell.games.cyclicrotation;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        assertArrayEquals(new Solution().solution(new int[]{3, 8, 9, 7, 6}, 3), new int[]{9, 7, 6, 3, 8});
        assertArrayEquals(new Solution().solution(new int[]{1, 2, 3, 4}, 4), new int[]{1, 2, 3, 4});
        assertArrayEquals(new Solution().solution(new int[]{1}, 10), new int[]{1});
        assertArrayEquals(new Solution().solution(new int[]{}, 10), new int[]{});
    }
}