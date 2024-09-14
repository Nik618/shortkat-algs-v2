package com.example.shortkatalgsv2.collections.easy.array;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class Rotate {

    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
    // сложность O(n)

    @PostConstruct
    public void rotate(Integer[] nums, int k) {

        System.out.println(Arrays.stream(nums).toList());

        int length = nums.length;

        int temp = 0;
        for (int i = length - 1; i >= k; i--) {
            temp =
            nums[-i + length] = nums[-i + k];
            nums[i] = nums[i - k];
        }

        System.out.println(Arrays.stream(nums).toList() + " " + k);
    }

}
