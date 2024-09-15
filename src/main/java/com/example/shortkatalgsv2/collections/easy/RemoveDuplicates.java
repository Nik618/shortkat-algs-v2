package com.example.shortkatalgsv2.collections.easy;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
    // O(n)

    @PostConstruct
    public void start() {
        removeDuplicates(new Integer[] {1, 2, 2, 3, 3});
    }

    public void removeDuplicates(Integer[] nums) {

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length) {
                arrayList.add(nums[i]);
                break;
            }
            if (!nums[i].equals(nums[i + 1])) {
                arrayList.add(nums[i]);
            }

        }
        int k = arrayList.size();
        nums = arrayList.toArray(new Integer[0]);

        System.out.println(Arrays.stream(nums).toList() + " " + k);
    }

}
