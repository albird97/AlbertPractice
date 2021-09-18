package com.example.practice;

import java.util.*;

public class RepeatedString {
    StringBuilder builder = new StringBuilder();

    //Repeated string
    public long repeatedString (String a, long n) {
        char targetChar = 'a';
        int inputStringSize = a.length();

        long completeString = n/a.length();
        long incompleteStringSize = n%a.length();

        long partialStrLen = (incompleteStringSize == 0) ? 0 : incompleteStringSize;
        long aCount = completeString * countA(a,inputStringSize,targetChar) + countA(a, partialStrLen, targetChar);

        return aCount;
    }

    public long countA(String s, long strLength, char targetChar) {
        int count = 0;
        for (int i = 0; i < strLength; i++) {
            if (s.charAt(i) == targetChar)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        RepeatedString main = new RepeatedString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String a = sc.next();
        System.out.println("Enter length");
        long n = sc.nextLong();
        long result = main.repeatedString(a,n);
        System.out.println("number of A: " + result);

    }
}
