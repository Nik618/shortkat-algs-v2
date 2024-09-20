package com.example.shortkatalgsv2;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UncommonWordsInTwoSentences {

    // https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
    // O(3*n) - ? Два раза итерируемся и складываем в лист в начале - ?

    @PostConstruct
    private void start() {
        process("this apple is sweet", "this apple is sour");
        process("apple apple", "this");
    }

    public void process(String string1, String string2) {
        Map<String, Integer> map = new HashMap<>();

        List<String> list = new java.util.ArrayList<>(Arrays.stream((string1.trim() + " " + string2.trim()).split(" ")).toList());

        list.forEach(it -> {
            map.putIfAbsent(it, 0);
            map.put(it, map.get(it) + 1);
        });

        List<String> outputList = new ArrayList<>();
        for (var entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                outputList.add(entry.getKey());
            }
        }
        System.out.println(outputList);
    }

}
