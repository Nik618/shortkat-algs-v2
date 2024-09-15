package com.example.shortkatalgsv2.collection.easy;

import jakarta.annotation.PostConstruct;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    // O(n)
    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/

    @PostConstruct
    public void start() {
        findSingleNumber(new Integer[] {1, 2, 2, 3, 3});
    }

    public void findSingleNumber(Integer[] nums) {

        int repeatingSum = 0;
        int totalSum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            repeatingSum += nums[i];
            if (set.contains(nums[i])) {
                totalSum += nums[i] * 2;
            } else
                set.add(nums[i]);
        }
        System.out.println(repeatingSum - totalSum);
    }

}
