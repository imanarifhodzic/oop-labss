package org.Week1andWeek2.lab;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        System.out.println("Type a num: ");
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int numOfPowers = Integer.parseInt(reader.nextLine());
        int i = 0;

        while (i<numOfPowers+1) {
            sum+=Math.pow(2,i);
            i++;
        }
        System.out.println("The result is: " + sum);
    }
}
