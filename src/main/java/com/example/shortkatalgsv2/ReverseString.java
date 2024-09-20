package com.example.shortkatalgsv2;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class ReverseString {

    @PostConstruct
    private void start() {
        process(new char[] {'s', 'n', 'o', 'w'});
    }

    public void process(char[] string) {
        int length = string.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = string[length - 1 - i];
            string[length - 1 - i] = string[i];
            string[i] = temp;
        }
        System.out.println(string);
    }

}
