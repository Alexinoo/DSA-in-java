package pointers;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){


        // Integers  - No Pointers
        int num1 = 11;
        int num2 = num1;

        System.out.println("Initialization with non pointers");
        System.out.println("Num1 : "+num1); //11
        System.out.println("Num2 : "+num2); //11

        System.out.println("Modify Num1 with non-pointers");
        num1 = 22;
        System.out.println("Num1 : "+num1); //22
        System.out.println("Num2 : "+num2); //11


        // Hashmap  - Pointers

        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value",11);
        map2 = map1;

        System.out.println("Initialization with pointers");

        System.out.println("Map1 : "+map1); //{value=11}
        System.out.println("Map2 : "+map2); //{value=11}

        map1.put("value",22);

        System.out.println("After Modification with pointers");

        System.out.println("Map1 : "+map1); //{value=22}
        System.out.println("Map2 : "+map2); //{value=22}



    }
}
