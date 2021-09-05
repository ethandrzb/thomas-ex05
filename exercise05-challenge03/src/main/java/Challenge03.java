/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution Challenge 3
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

public class Challenge03
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

        System.out.printf("""
                %d + %d = %d
                %d - %d = %d
                %d * %d = %d
                %d / %d = %.3f
                """, num1, num2, sum(num1, num2),
                num1, num2, difference(num1, num2),
                num1, num2, product(num1, num2),
                num1, num2, quotient(num1, num2));

        System.exit(0);
    }
    public static int sum(int num1,int num2)
    {
        return num1 + num2;
    }
    public static int difference(int num1,int num2)
    {
        return num1 - num2;
    }
    public static int product(int num1, int num2)
    {
        return num1 * num2;
    }
    public static double quotient(int num1, int num2)
    {
        return (double) num1 / num2;
    }
}
