package com.example.LearningSpringApis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitPracticeTest {

    private final JunitPractice junitPractice = new JunitPractice();

    @Test
    void shouldReturnSumOfThreeNos() {
        int[] numbers = {5, 2};
        int sum = junitPractice.calculateSum(numbers);
        int expectedResult = 7;
        assertEquals(expectedResult, sum);
    }
}
