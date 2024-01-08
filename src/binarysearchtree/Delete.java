package binarysearchtree;

public class Delete {
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

        myBST.deleteNode(2);

         /*
           THE LINES ABOVE CREATE THIS

                   3
                  / \
                 1   null
         */

        System.out.println("\nRoot: "+myBST.root.value);
        System.out.println("\nRoot->left: "+myBST.root.left.value);
        System.out.println("\nRoot->right: "+myBST.root.right);
    }
}
