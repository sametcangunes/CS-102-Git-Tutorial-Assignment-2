package com.company;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter array range:");
        int count = myObj.nextInt();

        int[] randomNumbers = new Random().ints(count, 0, 100).toArray();

        System.out.println(Arrays.toString(randomNumbers));
    }
}
