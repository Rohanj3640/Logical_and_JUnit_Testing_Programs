package com.logicalPrograms;
import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value to Find the Fibonacci Series: ");
        int fNumber = sc.nextInt();
        sc.close();
        getFibonacci(fNumber);  // calling function
    }

//      passing input to function as parameter
//      taking 1st and 2nd number for series
//      with for loop adding first number into second number then assign values respectively
//      and print the addition as next number of series

    private static void getFibonacci(int fNumber) {
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+","+num2);
        for (int i = 1; i <= fNumber - 2; i++) {
            int nextNumber = num1 + num2;
            num1 = num2;
            num2 = nextNumber;
            System.out.print(","+nextNumber);
        }
    }
}
