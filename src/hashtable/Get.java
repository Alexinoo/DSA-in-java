package hashtable;

public class Get {
    public static void main(String[] args){
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails",100);
        myHashTable.set("tile",50);
        myHashTable.set("lumber",80);

        myHashTable.printTable();

        //Get lumber and bolts
        System.out.println(myHashTable.get("lumber"));
        System.out.println(myHashTable.get("bolts"));
    }
}
