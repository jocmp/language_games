package com.josiahcampbell.games.binarygap;

import com.josiahcampbell.games.binarygap.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        assertEquals(solution.solution(1041), 5);
    }
}