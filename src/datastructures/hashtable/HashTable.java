package datastructures.hashtable;

import java.util.ArrayList;

public class HashTable {
    private int size=7;
    private Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(){
        dataMap = new Node[size];
    }

    private int hash(String key){ //key = paint
        int hash = 0;
        char[] keyChars = key.toCharArray(); // ['p','a','i','n','t']

        for(int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i]; //'p'
            hash = (hash + asciiValue * 23) % dataMap.length; // (0 + 112*23) % 7 - Generate [0-6]
        }
        return hash;
    }

    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[index] == null){     // check if address is empty
            dataMap[index] = newNode;   // set newNode to that address
        }else {
            Node temp = dataMap[index]; // Initialize temp to head
            while (temp.next != null) {     // If not empty loop through and append node to the end
                temp = temp.next;      // Exits the loop when temp reaches the end since temp is null
            }
            temp.next = newNode;      // Set newNode to temp.next
        }
    }

    public int get(String key){
        int index = hash(key);  //6
        Node temp = dataMap[index]; // dataMap[6] If empty , temp is set to null and return 0
        while(temp != null){        // Otherwise if there are items temp is set to head
             if(temp.key == key) return temp.value; //compares temp.key with the key and return value if matches found
             temp = temp.next;
        }
        return 0;  // Returns 0 if no match was found
    }

    public ArrayList keys(){
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while(temp != null){
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

    public void printTable(){
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while(temp != null){
                System.out.println(" {"+ temp.key +"="+ temp.value +"}");
                temp = temp.next;
            }
        }
    }
}
