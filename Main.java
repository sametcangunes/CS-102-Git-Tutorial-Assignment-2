package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu driven console");
            System.out.print("1.) the minimum of the array\n");
            System.out.print("2.) the maximum of the array\n");
            System.out.print("3.) the average of the array\n");
            System.out.print("4.) the sum of elements with odd and even-numbered indexes\n");
            System.out.print("5.) exit\n");

            System.out.print("Please enter your choice\n");
            choice = input.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("This is not a valid menu option, please try another!");
                    break;
            }
        }
    }
}
