
/*
 * Assignment NO 1 
 * Name :- Kunal Snajayrao Kherde 
 * Roll No :- SYCOB290
 * Div :- B
 * Batch :- B4
 * 
 * Problem Statement :- Write a Java Program to find the Largest and Smallest Number in an Array.
 * Aim :- To find the largest and smallest number in a given array
 */

import java.util.Scanner;

public class Ass1 {
    public static void main(String[] args) {
      int []arr = new int[5];

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        for (int i = 0; i < 5 ; i++) {
            arr[i]=sc.nextInt();
        }
        int lnum = arr[0];
        int snum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( arr[i] > lnum){
                lnum = arr[i];
            }
            else if(arr[i] < snum){
                snum = arr[i];
            }
        }
        System.out.println("The largest number is :" +lnum);
        System.out.println("The Smallest number is :" +snum);
    }
}
