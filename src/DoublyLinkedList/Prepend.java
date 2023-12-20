package DoublyLinkedList;

public class Prepend {

    public static void main(String[] args){
        DoublyLinkedList myDLL = new DoublyLinkedList(2);

        System.out.println("Before Prepend");
        myDLL.printList();

        /*
         Prepend - Edge case
            - Empty Doubly linked
            - Multiple items
         */

        myDLL.prepend(1);

        System.out.println("After Prepend");
        myDLL.printList();


    }
}
