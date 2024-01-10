package binarysearchtree;

public class DFSPreOrder {

    public static void main(String[] args){
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        //Traverse - Depth First Search - PreOrder  [47 , 21 , 18, 27 , 76 , 52 , 82]
        System.out.println(myBST.DFSPreOrder());
    }
}
