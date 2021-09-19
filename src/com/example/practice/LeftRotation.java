package com.example.practice;

import java.util.*;

//A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become . Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.
//
//        Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
//
//        Function Description
//
//        Complete the function rotLeft in the editor below.
//
//        rotLeft has the following parameter(s):
//
//        int a[n]: the array to rotate
//        int d: the number of rotations
//        Returns
//
//        int a'[n]: the rotated array
//        Input Format
//
//        The first line contains two space-separated integers  and , the size of  and the number of left rotations.
//        The second line contains  space-separated integers, each an .

public class LeftRotation {
    StringBuilder builder = new StringBuilder();

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> tempArray = new ArrayList(a.size());

        for (int i =0; i < a.size(); i++) {
            tempArray.set(i+a.size()-d,a.get(i));
        }
        return tempArray;

    }


    public static void main(String[] args) {
        LeftRotation main = new LeftRotation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rotation number");
        int r = sc.nextInt();
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int array[] = new int[n];
        List<Integer> list= new ArrayList<>(n);
        for (int i =0; i < n; i++) {
            System.out.println("Enter array index " + (i));
            array[i] = sc.nextInt();
        }
        //convert array to list
        Collections.addAll(list, Arrays.stream(array).boxed().toArray(Integer[]::new));
        System.out.println("Number of pairs: " + main.rotLeft(list,r));
    }
}
