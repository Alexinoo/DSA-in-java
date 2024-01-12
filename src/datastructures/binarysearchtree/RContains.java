package datastructures.binarysearchtree;

public class RContains {

    public static void main(String[] args){
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);


        // Contains 27
        System.out.println(myBST.rContains(27));
    }
}
