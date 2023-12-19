package linkedlist;

public class Set {

    public static void main(String[] args){

        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);

        System.out.println("Before Update");
        myLinkedList.printList();

        //Update value of Node 3 to 4 at index 1
        //myLinkedList.set(9,4); //index that does not exist
        myLinkedList.set(1,4); //index that exist


        System.out.println("After Update");
        myLinkedList.printList();
    }
}
