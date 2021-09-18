package com.example.practice;

import java.util.*;

public class JumpingOnTheClouds {
    StringBuilder builder = new StringBuilder();

    // Jumping on clouds
    public int jumpingOnClouds (int cloudList[]){
        int arraySize = cloudList.length;
        int count = -1;

        for (int i = 0; i < arraySize;i++,count++) {
            System.out.println("current index: " + i);
            if (i + 2 < arraySize && cloudList[i+2] == 0)
                i++;
            System.out.println(count);
        }
        return count;
    }

    public static void main(String[] args) {
        JumpingOnTheClouds main = new JumpingOnTheClouds();
        System.out.println("Enter number of clouds");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inputArray[] = new int[n];
        for (int i = 0; i<n;i++){
            System.out.println("Enter cloud number " + (i+1));
            inputArray[i] = sc.nextInt();
        }
        System.out.println(main.jumpingOnClouds(inputArray));

    }
}
