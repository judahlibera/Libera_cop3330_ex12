/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter the principle: ");
        double P = sc.nextDouble();
        System.out.printf("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.printf("Enter the number of years: ");
        int t = sc.nextInt();
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f.%n", t, r, P*(1 + (r/100)*(double)t));
    }
}