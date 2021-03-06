package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * Print Reverse number using while loop in java program
 * Such as =>
 * number = 1234
 * remainder = 1234 % 10 = 4
 * reverse = 0 * 10 + 4 = 0 + 4 = 4
 * number = 1234 / 10 = 123
 */
public class PrintReverseNumber20 {

    public static void main(String[] args) {
        int num, reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer Number: ");
        num = sc.nextInt();
        while (num != 0) {
//            reverse = reverse * 10;
//            reverse = reverse + num % 10;
//            num = num / 10;

            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        System.out.println("The reverse of Entered Number: " + reverse);

    }

}
