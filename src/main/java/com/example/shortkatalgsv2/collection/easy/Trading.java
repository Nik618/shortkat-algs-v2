package com.example.shortkatalgsv2.collection.easy;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class Trading {

    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
    // O(n)

    @PostConstruct
    public void start() {
        trading(new Integer[] {1, 2, 2, 3, 3});
    }

    public void trading(Integer[] prices) {
        int sum = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int difference = prices[i + 1] - prices[i];
            if (difference > 0)
                sum += difference;
        }
        System.out.println(sum);
    }

}
