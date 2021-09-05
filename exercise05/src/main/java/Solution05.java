/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Ethan Thomas
 */

import java.util.Scanner;

// Pseudocode Solution

// Prompt user for first number
// Attempt to store user input in <num1>

// Prompt user for second number
// Attempt to store user input in <num2>

// Compute sum of <num1> and <num2>
// Compute difference of <num1> and <num2>
// Compute product of <num1> and <num2>
// Compute quotient of <num1> and <num2>
// Print sum, difference, product, and quotient

public class Solution05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("What is the first number: ");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.print("What is the second number: ");
        num2 = Integer.parseInt(sc.nextLine());

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2;

        System.out.printf("""
                %d + %d = %d
                %d - %d = %d
                %d * %d = %d
                %d / %d = %.3f
                """, num1, num2, sum,
                num1, num2, difference,
                num1, num2, product,
                num1, num2, quotient);

        System.exit(0);
    }
}