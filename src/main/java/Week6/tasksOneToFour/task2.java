package Week6.tasksOneToFour;

public class task2 {
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int smallestInd = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest) {
                smallest = array[i];
                smallestInd = i;
            }
        }
        return smallestInd;
    }
}
