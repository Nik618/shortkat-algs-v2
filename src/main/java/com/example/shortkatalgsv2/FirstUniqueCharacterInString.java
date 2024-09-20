package com.example.shortkatalgsv2;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FirstUniqueCharacterInString {

    // https://leetcode.com/problems/first-unique-character-in-a-string/description/
    // O(2*n)

    @PostConstruct
    private void start() {
        process("snowest");
    }

    public void process(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            map.putIfAbsent(string.charAt(i), 0);
            map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
        }
        for (int i = 0; i < string.length(); i++) {
            if (map.get(string.charAt(i)) == 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }

}
