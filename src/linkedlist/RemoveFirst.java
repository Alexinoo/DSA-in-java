package linkedlist;

public class RemoveFirst {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        // removeFirst() and the possible edge cases

        //  (2) - Items - Return 1
        System.out.println(myLinkedList.removeFirst().value);

        //  (1) - Item - Return 2
        System.out.println(myLinkedList.removeFirst().value);

        //  (0) - Items - Return null
        System.out.println(myLinkedList.removeFirst());

    }
}
