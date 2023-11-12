package Week6.tasksOneToFour;

public class task3 {
    public static int indexTheSmallestStartingFrom(int[] array, int index){
        int smallest = array[0];
        int smallestInd = index;
        for (int i = index; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                smallestInd = i;
            }
        }
        return smallestInd;
    }
}
