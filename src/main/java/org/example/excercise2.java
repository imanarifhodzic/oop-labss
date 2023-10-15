package org.example;

import java.util.Scanner;

public class excercise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        int i = 0;
        while (i<3) {
            System.out.println("Enter number: ");
            read = reader.nextInt();
            sum+=read;
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}
