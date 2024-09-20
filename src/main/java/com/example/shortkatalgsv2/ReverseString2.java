package com.example.shortkatalgsv2;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class ReverseString2 {

    // https://leetcode.com/problems/reverse-string-ii/description/
    // O(n * (n/2))

    @PostConstruct
    private void start() {
        //process(new char[] {'s', 'n', 'o', 'w'}, 2);
        process(new char[] {'s', 'n', 'o', 'w', 'e', 's', 't'}, 2);
    }

    public void process(char[] string, int k) {
        int length = string.length;
        boolean flag = true;
        for (int i = 0; i <= length; i++) {
            if ((i + 1) % k == 0 && i != 0 && flag) {
                for (int j = i - k; j < (i + (i - k))/2; j++) {
                    char temp = string[i];
                    string[i] = string[j + 1];
                    string[j + 1] = temp;
                }
                flag = false;
            } else {
                if ((i + 1) % k == 0 && i != 0 && !flag) {
                    flag = true;
                }
            }
        }
        System.out.println(string);
    }

}
