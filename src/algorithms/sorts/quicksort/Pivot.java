package algorithms.sorts.quicksort;

import java.util.Arrays;

public class Pivot {

    public static void main(String[] args){
       int[] myArray = {4,6,1,7,3,2,5};

       int returnedIndex = pivot(myArray,0,myArray.length-1);
        System.out.println("\nReturned Index :"+returnedIndex);

        System.out.println(Arrays.toString(myArray));
    }

    public static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for(int i = pivotIndex + 1; i <= endIndex ; i++){
            if( array[i] < array[pivotIndex]){
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        //end result from the above loop 4,1,3,2,6,7,5 -> swapIndex = 3 pivotIndex = 0

        //swap pivotIndex with swapIndex  2,1,3,4,6,7,5

        swap(array ,pivotIndex, swapIndex);
        return swapIndex;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }




}
