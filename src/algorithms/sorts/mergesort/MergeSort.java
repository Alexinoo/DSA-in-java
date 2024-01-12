package algorithms.sorts.mergesort;

import java.util.Arrays;

import static algorithms.sorts.mergesort.Merge.merge;

public class MergeSort {

    public static void main(String[] args){
        int[] originalArray = {3,1,4,2};
        int[] sortedArray = mergeSort(originalArray);

        System.out.println("\n Original Array : "+Arrays.toString(originalArray));
        System.out.println("\n Sorted Array : "+Arrays.toString(sortedArray));
    }

    private static int[] mergeSort(int[] array) {
        if(array.length == 1) return array;
        int midIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array,0,midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array,midIndex,array.length));
        return merge(left,right);
    }


}
