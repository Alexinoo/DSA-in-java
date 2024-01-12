package datastructures.DoublyLinkedList;

public class Append {

    public static void main(String[] args){
        DoublyLinkedList myDLL = new DoublyLinkedList(1);

        myDLL.append(2);

        /* Append() -  Edge cases
        *
        *  Check if Doubly linked list is empty
        *   - head point to newNode
        *   - tail point to newNode
        *  */

        myDLL.printList();

    }
}
