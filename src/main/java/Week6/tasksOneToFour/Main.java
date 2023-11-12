package Week6.tasksOneToFour;

import java.util.Arrays;
public class Main{
    //task 1
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    //task 2
    public static int indexOfTheSmallest(int[] array){
        int smallest = array[0];
        int smallestInd = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                smallestInd = i;
            }
        }
        return smallestInd;
    }
    //task 3
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallest = array[0];
        int smallestInd = index;
        for (int i = index; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                smallestInd = i;
            }
        }
        return smallestInd;
    }
    //task 4


}

