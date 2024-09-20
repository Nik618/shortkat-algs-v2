package com.example.shortkatalgsv2;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class PlusOne {

    //https://leetcode.com/problems/plus-one/description/
    //O(n)

    @PostConstruct
    private void start() {
        process(new int[] {9, 7, 9, 9});
    }

    public void process(int[] inputArray, int n) {
        if (n == -1) {
            int inputArrayLength = inputArray.length;
            int[] newArray = new int[inputArrayLength];
            newArray[0] = 1;
            for (int i = 1; i < inputArrayLength; i++) {
                newArray[i] = 0;
            }
            System.out.println(Arrays.toString(newArray));
            return;
        }
        int num = inputArray[n] + 1;
        if (num != 10) {
            inputArray[n] += 1;
            System.out.println(Arrays.toString(inputArray));
        } else {
            inputArray[n] = 0;
            process(inputArray, n - 1);
        }
    }

    public void process(int[] inputArray) {
        process(inputArray, inputArray.length - 1);
    }

}
