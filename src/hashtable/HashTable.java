package hashtable;

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

    private int Hash(String key){ //key = paint
        int hash = 0;
        char[] keyChars = key.toCharArray(); // ['p','a','i','n','t']

        for(int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i]; //'p'
            hash = (hash + asciiValue * 23) % dataMap.length; // (0 + 112*23) % 7 - Generate [0-6]
        }
        return hash;
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
