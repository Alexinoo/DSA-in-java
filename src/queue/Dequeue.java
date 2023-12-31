package queue;

public class Dequeue {
    public static void main(String[] args){
        Queue myQueue = new Queue(2);
        myQueue.enqueue(1);

        //Edge cases

        // (2) Items - Returns Node 2
        System.out.println(myQueue.dequeue().value);
        // (1) Items - Returns Node 1
        System.out.println(myQueue.dequeue().value);
        // (0) Item - Returns null
        System.out.println(myQueue.dequeue());
    }
}
