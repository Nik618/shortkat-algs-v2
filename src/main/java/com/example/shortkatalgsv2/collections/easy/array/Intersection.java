package com.example.shortkatalgsv2.collections.easy.array;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Intersection {

    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
    // O(n^2)

    @PostConstruct
    public void start() {
        intersection(new Integer[] {1, 2, 3, 4}, new Integer[] {2, 3});
    }

    @PostConstruct
    public void intersection(Integer[] nums1, Integer[] nums2) {

        List<Integer> arrayList1 = Arrays.stream(nums1).toList();
        List<Integer> arrayList2 = new ArrayList<>(Arrays.stream(nums2).toList());

        arrayList1.forEach((n) -> {
                    if (arrayList2.contains(n)) {
                        System.out.print(n + " ");
                        arrayList2.remove(n);
                    }
                }
        );
    }

}
