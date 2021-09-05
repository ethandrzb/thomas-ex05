/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution Challenge 2
 *  Copyright 2021 Ethan Thomas
 */

import java.util.Scanner;

// Pseudocode Solution

// Prompt user for first number
// Attempt to store user input in <num1>
// if input is non-negative
//      proceed
// else
//      prompt user again
//      attempt to store user input in <num1>

// Attempt to store user input in <num2>
// if input is non-negative
//      proceed
// else
//      prompt user again
//      attempt to store user input in <num2>
// Compute sum of <num1> and <num2>
// Compute difference of <num1> and <num2>
// Compute product of <num1> and <num2>
// Compute quotient of <num1> and <num2>
// Print sum, difference, product, and quotient

public class Challenge02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        while(true)
        {
            System.out.print("Enter the first number: ");
            num1 = Integer.parseInt(sc.nextLine());
            if(num1 >= 0)
            {
                break;
            }
            else
            {
                System.out.println("Negative number entered!");
            }
        }

        while(true)
        {
            System.out.print("Enter the second number: ");
            num2 = Integer.parseInt(sc.nextLine());
            if(num2 >= 0)
            {
                break;
            }
            else
            {
                System.out.println("Negative number entered!");
            }
        }

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
