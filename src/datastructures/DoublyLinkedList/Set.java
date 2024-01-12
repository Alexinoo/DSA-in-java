package datastructures.DoublyLinkedList;

public class Set {
    public static void main(String[] args){
        DoublyLinkedList myDLL = new DoublyLinkedList(11);
        myDLL.append(3);
        myDLL.append(23);
        myDLL.append(7);

        System.out.println("Before Update");
        myDLL.printList();

        // Update 3 where index is 1
        myDLL.set(1,4);

        System.out.println("After Update");
        myDLL.printList();
    }
}
