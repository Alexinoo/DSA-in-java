package linkedlist;

public class Main {

    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

        // Append 3 :Result -  2 3
       // myLinkedList.append(3);


        // Prepend 1 :Result - 1 2 3
       // myLinkedList.prepend(1);





       /* removeLast() and the possible edge cases
         (2) - Items - Return 2 Node
        System.out.println(myLinkedList.removeLast().value);
         (1) - Item - Return 1 Node
        System.out.println(myLinkedList.removeLast().value);
         (0) - Items - Return null
        System.out.println(myLinkedList.removeLast());
        */

        //  removeFirst() and the possible edge cases
        //  (2) - Items - Return 2 Node
        System.out.println(myLinkedList.removeFirst().value);

        //  (1) - Item - Return 1 Node
        System.out.println(myLinkedList.removeFirst().value);

        //  (0) - Items - Return null
       System.out.println(myLinkedList.removeFirst());



        // myLinkedList.printList();

        /*
        myLinkedList.getHead(); Head : 1
        myLinkedList.getTail(); Tail : 1
        myLinkedList.getLength(); Length : 1
        */
    }
}
