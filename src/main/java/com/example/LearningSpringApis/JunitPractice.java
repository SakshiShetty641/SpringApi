package com.example.LearningSpringApis;

public class JunitPractice {

    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;

    }

}
