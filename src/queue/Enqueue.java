package queue;

public class Enqueue {

    public static  void main(String[] args){
        Queue myQueue = new Queue(1);


        System.out.println("Before Enqueue");
        myQueue.printQueue();

        //Enqueue
        myQueue.enqueue(2);

        System.out.println("After Enqueue");
        myQueue.printQueue();


    }
}
