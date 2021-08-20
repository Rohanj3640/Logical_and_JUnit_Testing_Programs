package com.logicalPrograms;
import java.util.Scanner;

public class Perfect_Number {
    public static void main(String args[]) {
        long n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check perfect number: ");
        n = sc.nextLong();
        int i = 1;

         // While Loop executes till the condition is false and sum is used to calculate sum of factors
        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
         // Comparing sum with the entered number

        if (sum == n) {

            System.out.println(n + " It is a perfect number.");
        } else

            System.out.println(n + " It is not a perfect number.");
        sc.close();
    }
}
