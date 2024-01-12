package algorithms.sorts.quicksort;

import java.util.Arrays;

import static algorithms.sorts.quicksort.Pivot.pivot;

public class QuickSort {

    public static void main(String[] args){
        int[] myArray = {4,6,1,7,3,2,5};
        quickSort(myArray,0, myArray.length-1);
        System.out.println(Arrays.toString(myArray));
    }

    public static void quickSort(int[] array, int left , int right){

        /* Base case LEFT
                quickSort(array, left, pivotIndex - 1);
                started left = 0 and right = 2
                next    left = 0 and right = 0 --base case

         */


        /* Base case -- RIGHT
                quickSort(array, pivotIndex + 1,right);
                started left = 4 and right = 6
                next    left = 4 and right = 0 --base case

         */
        if(left < right) { //base case
        /* pivot() does 2 things
            - Rearranges [4,6,1,7,3,2,5] to [2, 1, 3, 4, 6, 7, 5]
            - Returns swapIndex that we store in pivotIndex
         */
            int pivotIndex = pivot(array, left, right);

            /* Run Quick sort on left before pivot 2, 1, 3 */
            quickSort(array, left, pivotIndex-1);

            /* Run Quick sort on right after pivot 6,7,5 */
            quickSort(array, pivotIndex+1, right);
        }

    }
}
