package heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {

    private List<Integer> heap; //A list of integers we call heap

    public Heap(){
        this.heap = new ArrayList<>(); //Implement as an array list in the constructor
    }

    public List<Integer> getHeap(){ // Return the copy of a heap - don't give access to any
        return new ArrayList<>(heap);
    }

    private int leftChild(int index){ //Determine left child when the index starts from 0
        return 2 * index + 1;
    }

    private int rightChild(int index){ //Determine right child when the index starts from 0
        return 2 * index + 2;
    }

    private void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1,heap.get(index2));
        heap.set(index2,temp);
    }
}
