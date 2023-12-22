package DoublyLinkedList;

public class RemoveFirst {

    public static void main(String[] args){
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(1);

         /* removeFirst Edge cases
            - Multiple items 2- Traverse head
            - When 1 item -  head and tail to point to null
            - When 0 items - return null
         */

        //  (2) - Items - Return 2
        System.out.println(myDLL.removeFirst().value);

        //  (1) - Item - Return 1
        System.out.println(myDLL.removeFirst().value);//  (2) - Items - Return 1

        // 0 - items
         System.out.println(myDLL.removeFirst());
    }
}
