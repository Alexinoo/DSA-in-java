package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
          head = newNode;
          tail = newNode;
          length = 1;
        }else{
            tail.next = newNode;
            tail = newNode;
            length++;
        }
    }

    public Node removeLast(){
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre =  temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length ==0){
            head = null;
            tail= null;
        }
        return temp;
    }


    public void prepend(int value){
        Node newNode = new Node(value);
        if(length ==0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if (length ==0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length ==0) tail=null;

        return temp;
    }

    public void getHead() {
        System.out.println("Head : "+head.value);
    }

    public void getTail() {
        System.out.println("Tail : "+tail.value);
    }

    public void getLength() {
        System.out.println("Length : "+length);
    }
}
