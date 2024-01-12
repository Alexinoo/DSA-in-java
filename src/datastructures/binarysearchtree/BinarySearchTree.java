package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
     Node root;

    class Node {
         int value;
         Node left;
         Node right;
        Node(int value){

            this.value = value;
        }

    }

    /*

     Steps to reproduce - insert(value)
      ======================
      Create a new node
        Node newNode = new Node(value)
      if empty or (root == null) set root to new node and return true
            root = newNode
            return true
      Otherwise,initialize temp to root
            temp = root
      while loop

      check if value to insert matches return false; --Edge case

        if value < temp.value
            if spot is null insert --Edge case
                set temp.left = newNode
                return true
            Otherwise [ Go left]
                temp = temp.left

        else
            if spot is null insert --Edge case
                set temp.right = newNode
                return true
            Otherwise [ Go right]
                temp = temp.right

     */

    public boolean insert(int value){
      Node newNode = new Node(value);

      if(root == null){
          root = newNode;
          return true;
      }

      Node temp = root;
      while (true){
          if(newNode.value == temp.value) return false;

          if(newNode.value < temp.value){
              if(temp.left == null){
                  temp.left = newNode;
                  return true;
              }
              temp = temp.left;
          }else{
              if(temp.right == null){
                 temp.right = newNode;
                 return true;
              }
              temp = temp.right;
          }
      }
    }

    /*
      Steps to reproduce contains(value)
      ======================

      if empty or (root == null) return false [Optional]
      temp = root
      while temp != null
        if value < temp.value  [ Go left]
            temp = temp.left
        else if value > temp.value  [ Go right]
            temp = temp.right
        else
            match found [return true]
      return false
     */

    public boolean contains(int value){
        if (root == null) return false;
        Node temp = root;
        while(temp != null){
            if(value < temp.value){
                temp = temp.left;
            }else if(value > temp.value){
                temp = temp.right;
            }else{
                return true;
            }
        }
        return false;
    }

    /*
    * contains() recursively
    * */

    private boolean rContains(Node currentNode, int value){
        if(currentNode == null) return false;

        if(currentNode.value == value) return true;

        if(value < currentNode.value){
            return rContains(currentNode.left,value);
        }else{
            return rContains(currentNode.right,value);
        }
    }

    public boolean rContains(int value){
       return rContains(root,value);
    }


    /*
     * Written insert() recursively
     * */

    private Node rInsert(Node currentNode, int value){
        if(currentNode == null) return new Node(value);

        if(value < currentNode.value){
            currentNode.left = rInsert(currentNode.left,value);
        }else if(value > currentNode.value){
            currentNode.right = rInsert(currentNode.right,value);
        }
        return currentNode;
    }

    public void rInsert(int value){
        if(root == null) {
            root = new Node(value);
        }
        rInsert(root,value);
    }


    /*
     * Find minimum value
     * */

    public int minValue(Node currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    /*
     * Delete Node
     * - Check if tree is empty or root is null and return null
     * - Traverse to the right if value > root
     *     i) pass deleteNode(Node currentNode, int value)
     * - Traverse to the left if value < root
     * - Once you get to the node that you want to delete
     *      - Edge cases
     *         i) The node is a Leafy node
     *         ii) The node to delete has a node to the right and none to the left
     *         iii)The node to delete has a node to the left and none to the right
     *         iv) The node has both to the left and right
     *               - Find the minimum value of the subtree
     *               - Copy the value to the
     *               - Drop by calling deleteNode() on it
     * - Return the node that you have deleted
     * */
    private Node deleteNode(Node currentNode, int value){
        if(currentNode == null) return null;

        if( value < currentNode.value){
            currentNode.left = deleteNode(currentNode.left,value);
        }else if(value > currentNode.value){
            currentNode.right = deleteNode(currentNode.right,value);
        }else{
            if(currentNode.left == null && currentNode.right == null){
                return null;
            }else if(currentNode.left == null ){
                currentNode = currentNode.right;
            }else if(currentNode.right == null){
                currentNode = currentNode.left;
            }else{
              int subTreeMin = minValue(currentNode.right);
              currentNode.value = subTreeMin;
              currentNode.right= deleteNode(currentNode.right , subTreeMin);
            }
        }
        return currentNode;
    }

    public void deleteNode(int value){
        deleteNode(root,value);
    }


    /* TRAVERSAL*/

    /*
    Breadth First Search
    =====================
    *
    * Adds Level after Level - starts with the root
    * Adds child nodes start with Left
                10          [10]
               / \
              9    11       [10 , 9 , 11]
             / \   / \
            7   8 12  13    [10 , 9 , 11 , 7 , 8 , 12, 13]

    * Definition
    * ============
      - Returns an ArrayList of Integers from BST
      - Built-in Queue in Java uses a LinkedList
      - Create an ArrayList of Integers that we are going to return
      -
    * Start
    ======
      - Add root to the datastructures.queue
      - Use while loop that runs when there are items in the datastructures.queue
        - Remove the currentNode from the datastructures.queue
           - Add it to results ArrayList
        - Check if there is a node at the left
           - Add it to the datastructures.queue
        - Check if there is a node at the right and
           - Add it to the datastructures.queue
      - Return results arrayList
      *
    * */
    public ArrayList<Integer> BreadthFirstSearch(){
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(root);

        while(queue.size() > 0){
            currentNode = queue.remove();
            results.add(currentNode.value);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return results;

    }

    /*
    *
    Depth First Search
    =====================
    * Uses Recursion
    *
    * Create a method inside this method but since java does not allow you to do that there is a work around
    * Have an internal class and add the method inside it

    PreOrder
    ========
    * Starts with the root - Add it first
    * Go left (recursively)- adding each node at every level from the left until you get to the bottom left
    * Go Right after exhausting Left
    *
    *           47          [47]              []
               / \
              21  76       [47 , 21]
             / \  / \
           18  27 52 82    [47 , 21 , 18]

                           [47 , 21 , 18, 27]

    * Go Right after exhausting Left

                           [47 , 21 , 18, 27 , 76]

                           [47 , 21 , 18, 27 , 76 , 52]

                           [47 , 21 , 18, 27 , 76 , 52 , 82]


    PostOrder
    ========
    * Traverse to the leafy node at bottom left
    *
    * Add the bottom left leafy node
    * Traverse the root and go right
    * Add the bottom right leafy node it
    * Add the root of this siblings and
    * Repeat..
    *
    *           47          [18]
               / \
              21  76       [18 , 27]
             / \  / \
           18  27 52 82    [18 , 27 , 21 ]


    * Go Right after exhausting Left - Start with the bottom left

                           [18 , 27 , 21 , 52]

                           [18 , 27 , 21 , 52 , 82]

                           [18 , 27 , 21 , 52 , 82 , 76]

                           [18 , 27 , 21 , 52 , 82 , 76 , 47]



    InOrder - Ordered
    ========
    * Traverse to the leafy node at bottom left
    *
    * Add the bottom left leafy node
    * Traverse the root and go right
    * Add the bottom right leafy node it
    * Add the root of this siblings and
    * Repeat..
    *
    *           47         [18]
               / \
              21  76       [18 , 21]
             / \  / \
           18  27 52 82    [18 , 21 , 27 ]


    * Go Right after exhausting Left - Start with the bottom left

                           [18 , 21 , 27 , 47 ]

                           [18 , 21 , 27 , 47 , 52 ]

                           [18 , 21 , 27 , 47 , 52 , 76]

                           [18 , 21 , 27 , 47 , 52 , 76 , 82]

    * Prints the List in an ordered manner
    * */

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                results.add(currentNode.value);
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }

        }
        new Traverse(root);

        return results;
        }


        public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }

        }
        new Traverse(root);

        return results;
        }


    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);

                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }

            }

        }
        new Traverse(root);

        return results;
    }

}
