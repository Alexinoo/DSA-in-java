package DoublyLinkedList;

public class Insert {

    public static void main(String[] args){

        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(3);

        /* insert (index , value) Edge cases

            - If index is out of range  index < 0 or index > length - return false
            - If index is 0 insert at the beginning - call prepend() - return true;
            - If index is equal to length insert at the end - call append() - return true;

            - Create new node
            - Get before and after nodes using the get()
            - Insert new node in between
         */

        System.out.println("Before Insert");
        myDLL.printList();

         // Insert
        myDLL.insert(1,2);

        System.out.println("After Insert");
        myDLL.printList();


    }
}
