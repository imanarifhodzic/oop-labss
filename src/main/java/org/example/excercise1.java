package org.example;

import java.util.Scanner;

public class excercise1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String pass = "apple";
        while (true){
            System.out.println("Type the password: ");
            String att = reader.nextLine();
            if (pass.equals(att)){
                System.out.println("Right!");
                System.out.println("The secret is: fruit");
                break;
            }
            else {
                System.out.println("Wrong!");
            }
        }
    }
}

