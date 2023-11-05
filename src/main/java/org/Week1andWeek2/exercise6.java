package org.Week1andWeek2;
import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        printText();
    }
    public static void printText() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type how many times you want to display the sentence: ");
        int a = Integer.parseInt(reader.nextLine());
        int i = 0;
        while (i<a) {
            System.out.println( "In the beginning there were the swamp, the hoe and Java.");
            i++;
        }
    }
}
