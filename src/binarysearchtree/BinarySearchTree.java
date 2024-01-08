package binarysearchtree;

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



}
