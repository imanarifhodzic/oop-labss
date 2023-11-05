package org.Week1andWeek2;
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First num: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Second num: ");
        int b = Integer.parseInt(reader.nextLine());
        int i = 0;
        int dis = b-a;
        while (i<dis+1) {
            System.out.println(a+i);
            i++;
        }
    }
}

