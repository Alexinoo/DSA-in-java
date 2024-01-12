package datastructures.linkedlist;

public class Insert {
    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(3);

        /* Insert Edge cases
        *  - Insert at the beginning ( When index == 0 )
        *  - Insert at the middle - More logic
        *  - Insert at the end ( When index == lengthOFTheList )
        *
        */

        System.out.println("Before Insert");
        myLinkedList.printList();

        /* Insert 1 at the beginning */
        myLinkedList.insert(0,0);


        /* Insert 2 at the middle */
        myLinkedList.insert(2,2);

        /* Insert 3 at the end */
        myLinkedList.insert(4,4);

        System.out.println("After Insert");
        myLinkedList.printList();
    }
}
