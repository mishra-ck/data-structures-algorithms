package ds.nonlinear.trees.binarysearchtree;

import ds.nonlinear.trees.binarytree.BinaryTree;
import ds.nonlinear.trees.binarytree.BinaryTreeNode;

public class BST<T extends Comparable> extends BinaryTree {

    /** -----   INSERT : O(h)  -----*/
    public void insert(T value){
        root = insertHelper(root, value);
        size++ ;
    }
    private BinaryTreeNode insertHelper(BinaryTreeNode node, T value) {
        if(node == null) return new BinaryTreeNode<>(value);

        int compare = value.compareTo(node.getValue());
        if(compare < 0){
            node.setLeft(insertHelper(node.getLeft(),value));
        }else if(compare > 0){
            node.setRight(insertHelper(node.getRight(),value));
        }
        // For compare == 0 , duplicate case ignore it
        return node;
    }

    /**  ------ SEARCH : O(h) -------- */
    public boolean contains(T value){
        return searchHelper(root, value) != null ;
    }
    private BinaryTreeNode<T> searchHelper(BinaryTreeNode node, T value) {
        if(node == null) return  null;
        int compare = value.compareTo(node.getValue());
        if(compare == 0) return node;
        if(compare < 0){
            return searchHelper(node.getLeft(),value);
        }
        return searchHelper(node.getRight(),value);
    }
    /** --------- DELETE : O(h)  ---------- */
    public void delete(T value){
        root = deleteHelper(root,value);
        size-- ;
    }
    private BinaryTreeNode<T> deleteHelper(BinaryTreeNode node, T value) {
        if(node == null) return null ;
        int compare = value.compareTo(value);

        if(compare < 0){
            node.setLeft(deleteHelper(node.getLeft(),value));
        } else if (compare > 0) {
            node.setRight(deleteHelper(node.getRight(),value));
        }else{
            /** Node to be deleted is found */

            // CASE 1 : No left child
            if(node.getLeft() == null) return node.getRight();
            // CASE 2 : No right child
            if(node.getRight() == null) return  node.getLeft();
            // CASE 3 : Two children - replace with inorder successor
            /*TODO*/
        }
        return node;
    }

}
