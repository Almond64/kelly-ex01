/*
 *  UCF COP3330 Fall 2021 Exercise 1 Solution
 *  Copyright 2021 Paul Kelly
 */
import java.util.Scanner;

/*
For this exercise, I ask the user for their name.
The user inputs a string that I scan in using the Scanner.
I print a greeting using the user's name.
 */

public class Solution01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = input.next();
        System.out.printf("Hello, %s, nice to meet you!", name);
    }
}
