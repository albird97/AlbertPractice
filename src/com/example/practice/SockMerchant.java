package com.example.practice;

import java.util.*;

public class SockMerchant {
    StringBuilder builder = new StringBuilder();

    // Sock merchant
    public int sockMerchant (int n, List<Integer> ar ) {
        int pair = 0;
        Collections.sort(ar);
        System.out.println(ar);

        for (int i = 0; i < n; i++) {
            if (i + 2 < n && ar.get(i) == ar.get(i + 1)) {
                pair++;
                i++;
            } else if (i + 1 < n && ar.get(i) == ar.get(i + 1)) {
                pair++;
            }
        }

        return pair;
    }


    public static void main(String[] args) {
        SockMerchant main = new SockMerchant();
        // Sock merchant
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of socks");
        int n = sc.nextInt();
        int array[] = new int[n];
        List<Integer> list= new ArrayList<>(n);
        for (int i =0; i < n; i++) {
            System.out.println("Enter sock " + (i+1));
            array[i] = sc.nextInt();
            //list.set(i,sc.nextInt());
        }
        //convert array to list
        Collections.addAll(list,Arrays.stream(array).boxed().toArray(Integer[]::new));
        System.out.println("Number of pairs: " + main.sockMerchant(n,list));

    }
}
