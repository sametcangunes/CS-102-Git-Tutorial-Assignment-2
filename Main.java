package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    
    public static double[] differrenceFromMean(int[] array){
        double[] x =  new double[array.length];
        double mean = 0;
        for(int i = 0; i < array.length; i++){
            mean+= array[i];
        }
        mean = mean/array.length;
        System.out.println(mean);
        for(int i = 0; i < array.length; i++){
            x[i] = array[i] - mean;
        }
        return x;
    }
    



    public static int[] RandomArray(int n){

        int[] randomNumbers = new Random().ints(n, 0, 100).toArray();
        return randomNumbers;
    }


    public static String sumOfNumbers(int array[])
    {
        int evenNumberedIndexes = 0;
        int oddNumberedIndexes = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(i % 2 == 0)
            {
                evenNumberedIndexes = evenNumberedIndexes + array[i];
            }
            else
            {
                oddNumberedIndexes = oddNumberedIndexes + array[i];
            }
        }
        return "Sum of even numbered indexes is " + evenNumberedIndexes + "\n" + 
        "Sum of odd numbered indexes is " + oddNumberedIndexes;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        int arraySize;
        System.out.print("enter a wanted array size");
        arraySize=input.nextInt();
        int[] array = RandomArray(arraySize);

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
                    System.out.println(min(array));
                    break;
                case 2:
                    System.out.println(max(array));
                    break;
                case 3:
                    System.out.println( Arrays.toString(differrenceFromMean(array)) );
                    break;
                case 4:
                    System.out.println(sumOfNumbers(array));
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
