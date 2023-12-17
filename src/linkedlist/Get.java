package linkedlist;

public class Get {

    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        /* get Node at a particular index*/
        System.out.println(myLinkedList.get(3).value +"\n");


        myLinkedList.printList();
    }
}
