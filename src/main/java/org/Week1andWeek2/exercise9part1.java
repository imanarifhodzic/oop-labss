package org.Week1andWeek2;

public class exercise9part1 {
    private static void drawStarsPyramidUpsideDown(int rows){

        for (int i=rows; i>=1; i--){
            for (int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        drawStarsPyramidUpsideDown(5);
    }
}