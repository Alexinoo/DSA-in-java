package binarysearchtree;

public class MinValue {
    public static void main(String[] args){
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        /*

             THE LINES ABOVE CREATE THIS

                        47
                       /  \
                      21   76
                     /  \  / \
                    18  27 52 82
         */


        // Find Minimum value
        /*
            i. On root myBST.minValue(47)
            ii.On root myBST.minValue(76)
         */
        System.out.println(myBST.minValue(myBST.root));
        System.out.println(myBST.minValue(myBST.root.right));
    }
}
