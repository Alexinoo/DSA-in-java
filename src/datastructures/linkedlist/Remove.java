package datastructures.linkedlist;

public class Remove {

    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);

        /*  Remove() - Edge cases
         *  Remove the first item - Return removeFirst()
         *  Remove the last item - Return removeLast()
         *  Remove at the middle - More Logic ( Need prev and temp ) - More logic
         *
         */

        System.out.println("Before Remove value 23");
        myLinkedList.printList();

        // Remove 23
        myLinkedList.remove(2);

        System.out.println("After Removing value 23");
        myLinkedList.printList();
    }
}
