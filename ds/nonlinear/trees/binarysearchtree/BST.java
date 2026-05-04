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

}
