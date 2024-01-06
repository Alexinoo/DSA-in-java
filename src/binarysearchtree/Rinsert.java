package binarysearchtree;

public class Rinsert {

    public static void main(String[] args){
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);

        /*
           THE LINES ABOVE CREATE THIS

                   2
                  / \
                 1   3
         */

        System.out.println("\nRoot: "+myBST.root.value);
        System.out.println("\nRoot->left: "+myBST.root.left.value);
        System.out.println("\nRoot->right: "+myBST.root.right.value);
    }
}
