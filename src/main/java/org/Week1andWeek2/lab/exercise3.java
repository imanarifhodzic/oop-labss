package org.Week1andWeek2.lab;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter numbers for sum, enter 0 and it stops.");

        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read==0){
                break;
            }
            else{
                sum+=read;
            }
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum final: "+ sum);
    }
}
