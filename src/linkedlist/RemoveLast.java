package linkedlist;

public class RemoveLast {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

      /* removeLast() and the possible edge cases */

       //  (2) - Items - Return 2
        System.out.println(myLinkedList.removeLast().value);

      //   (1) - Item - Return 1
        System.out.println(myLinkedList.removeLast().value);

      //   (0) - Items - Return null
        System.out.println(myLinkedList.removeLast());

    }

}
