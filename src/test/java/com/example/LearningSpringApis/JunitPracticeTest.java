package com.example.LearningSpringApis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitPracticeTest {

    private final JunitPractice junitPractice = new JunitPractice();

    @Test
    void shouldReturnSumOfThreeNos() {
        assertEquals(7, junitPractice.calculateSum(new int[]{5, 2}));
    }

    @Test
    void shouldReturnSumOfEmptyArray() {
        assertEquals(0, junitPractice.calculateSum(new int[]{}));
    }
}
