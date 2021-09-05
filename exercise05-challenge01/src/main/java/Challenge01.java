/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Ethan Thomas
 */

import java.util.Scanner;

// Pseudocode Solution

// Prompt user for first number
// Attempt to store user input in <num1>
// if input is valid
//      proceed
// else
//      prompt user again
//      attempt to store user input in <num1>

// Attempt to store user input in <num2>
// if input is valid
//      proceed
// else
//      prompt user again
//      attempt to store user input in <num2>
// Compute sum of <num1> and <num2>
// Compute difference of <num1> and <num2>
// Compute product of <num1> and <num2>
// Compute quotient of <num1> and <num2>
// Print sum, difference, product, and quotient

public class Challenge01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        while(true)
        {
            System.out.print("Enter the first number: ");
            try
            {
                num1 = Integer.parseInt(sc.nextLine());
                break;
            }
            catch(Exception e)
            {
                System.out.println("Invalid number entered!");
            }
        }

        while(true)
        {
            System.out.print("Enter the second number: ");
            try
            {
                num2 = Integer.parseInt(sc.nextLine());
                break;
            }
            catch(Exception e)
            {
                System.out.println("Invalid number entered!");
            }
        }

        System.out.print(num1 + " + " + num2 + " = " + (num1 + num2) + '\n'
                + num1 + " - " + num2 + " = " + (num1 - num2) + '\n'
                + num1 + " * " + num2 + " = " + (num1 * num2) + '\n'
                + num1 + " / " + num2 + " = " + (num1 / num2) + '\n');

        System.exit(0);
    }
}