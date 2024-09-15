package com.example.shortkatalgsv2.collections.easy.array;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class Rotate {

    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
    // сложность O(n)

    @PostConstruct
    public void start() {
        rotate(new Integer[] {1, 2, 3, 4}, 2);
    }

    public void rotate(Integer[] nums, int k) {

        System.out.println(Arrays.stream(nums).toList());

        int length = nums.length;

        int temp = 0;
        for (int i = 0; i < length - k; i++) {
            temp = nums[i + k];
            nums[i + k] = nums[i];
            nums[i] = temp;
        }

        System.out.println(Arrays.stream(nums).toList() + " " + k);
    }

}
