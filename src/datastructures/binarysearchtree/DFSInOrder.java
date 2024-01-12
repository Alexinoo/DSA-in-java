package datastructures.binarysearchtree;

public class DFSInOrder {
    public static void main(String[] args){
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        //Traverse - Depth First Search - InOrder  [18 , 21 , 27 , 47 , 52 , 76 , 82]
        System.out.println(myBST.DFSInOrder());
    }
}
