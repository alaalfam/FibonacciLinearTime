package com.company;
import java.util.Scanner;
// order (Linear time) = O(n)
public class Main {
    private static int [] arr ;
    private static void fib(int n){
        if(n <= 0){
            System.out.println("N should be greater than zero.");
        }
        else{
            if (n == 1) {
                arr[0] = 1 ;
            }
            else if (n == 2){
                arr[0] = arr[1] = 1 ;
            }
            else {
                arr[0] = arr[1] = 1 ;
                for (int i = 2; i < n; i++) {
                    arr[i] = arr[i-1]+arr[i-2];
                }
            }
        }
    }
    private static void printArray(int [] arr){
        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number n.");
        int n = scan.nextInt();
        arr = new int [n] ;
        fib(n);
        printArray(arr);
    }
}
