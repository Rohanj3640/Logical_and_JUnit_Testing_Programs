package com.jUnitTestingPrograms;
import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int dec = sc.nextInt();
        //calling method to main
        toBinary(dec);
    }

    /**
     * In this method we are doing the conversion process from decimal to binary
     * using while and for loops
     */
    private static void toBinary(int n) {
        int[] binaryNum = new int[20];
        int i = 0;
        while (n > 0)
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
}
