package datastructures.DoublyLinkedList;

public class RemoveLast {

    public static void main(String[] args){
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);

        /* removeLast() and the possible edge cases */

        //  (2) - Items - Return 2
        System.out.println(myDLL.removeLast().value);

        //   (1) - Item - Return 1
        System.out.println(myDLL.removeLast().value);

        //   (0) - Items - Return null
        System.out.println(myDLL.removeLast());

    }

}
