package datastructures.binarysearchtree;

public class Contains {
    public static void main(String[] args){
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        //Search 27
        System.out.println(myBST.contains(27));

        //Search 17
        System.out.println(myBST.contains(17));
    }
}
