package com.example.shortkatalgsv2.collections.easy;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ContainsDuplicates {

    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
    // сложность O(n)

    @PostConstruct
    public void start() {
        containsDuplicates(new Integer[] {1, 2, 2, 3, 4});
    }

    public void containsDuplicates(Integer[] nums) {
        Set<Integer> set = Arrays.stream(nums).collect(Collectors.toSet());
        System.out.println(set.size() < nums.length);
    }

}
