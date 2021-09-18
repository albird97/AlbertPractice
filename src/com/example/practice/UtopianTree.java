package com.example.practice;

import java.util.*;

public class UtopianTree {
    StringBuilder builder = new StringBuilder();

    // Utopian Tree
    public int calculateTree(int n) {
        int startingHeight = 1;
        int flag = 0;
        for (int i = 0; i < n;i++){
            if (flag == 0) {
                startingHeight = startingHeight * 2;
                flag = 1;
            } else if (flag == 1) {
                startingHeight = startingHeight + 1;
                flag = 0;
            }
            System.out.println("loop index=" + i + "\ncurrent height = " + startingHeight);
        }
        return startingHeight;
    }

    public static void main(String[] args) {
        UtopianTree main = new UtopianTree();
        System.out.println(main.calculateTree(50));

    }
}
