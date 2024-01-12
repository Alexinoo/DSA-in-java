package datastructures.DoublyLinkedList;

public class Remove {

    public static void main(String[] args){

        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);

        System.out.println("Before Remove");
        myDLL.printList();

        //Remove at index 1
        myDLL.remove(1);

        System.out.println("After Remove");
        myDLL.printList();



    }
}
