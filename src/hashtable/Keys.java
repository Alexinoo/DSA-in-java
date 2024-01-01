package hashtable;

public class Keys {
    public static void main(String[] args){
        HashTable myHashTable = new HashTable();

        myHashTable.set("paint",20);
        myHashTable.set("bolts",40);
        myHashTable.set("nails",100);
        myHashTable.set("tile",50);
        myHashTable.set("lumber",80);

        myHashTable.printTable();

        // Get all Keys
        System.out.println("Get All Keys");
        System.out.println(myHashTable.keys());
    }
}
