package linkedlist;

public class Reverse {

    public static void main(String[] args){

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        /* Reverse [1 ,2, 3 ,4] To [4 ,3 ,2 ,1]
        *
        *  Reverse head to point to tail and vice versa - use temp
        *
        *  Add pointer variables
        *
        *  before = null
        *  temp to point to head
        *  after  to point to temp.next
        *
        *  Use for loop
        *  Add the four lines of code inorder
        *   - after = temp.next;
            - temp.next = before;
            - before = temp;
            - temp = after;
        * */

        System.out.println("Before Reverse");
        myLinkedList.printList();

        // Reverse
        myLinkedList.reverse();

        System.out.println("After Reverse");
        myLinkedList.printList();


    }
}
