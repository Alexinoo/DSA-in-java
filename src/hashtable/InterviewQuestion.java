package hashtable;

/*
Given 2 arrays [1,3,5] and [2,4,5]
Find if the 2 arrays have an item in common
i.e They both contain 5 but how do you write the code to do that

    OPTIONS
    ========

    1. Nested For loop - Though it's very inefficient
    2. HashMap
 */

import java.util.Hashtable;

public class InterviewQuestion {

    /*
    OPTION 1 - Nested For Loop
    ==============

    public static boolean itemInCommon(int[] array1,int[] array2){
        for (int i: array1) {
            for (int j: array2 ) {
                if(i == j) return true;
            }
        }
        return false;
    }

    */

    /*
    * OPTION 2 - HashMap
      ==================
      *
      *
    */
    public static boolean itemInCommon(int[] array1,int[] array2){
        Hashtable<Integer,Boolean> myHashMap = new Hashtable<>();

        // Add to myHashmap as key value pair {1,true},{3,true},{5,true}
        for (int i: array1) {
            myHashMap.put(i,true);
        }

        // Check if j is in our hashmap as a key
        for (int j: array2 ) {
           if(myHashMap.get(j) != null) return true;
        }
        return false;
    }

   public static void main(String[] args){
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,5};
       System.out.println(itemInCommon(array1,array2));
   }
}
