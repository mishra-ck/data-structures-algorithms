package ds.nonlinear.trees.binarysearchtree;

import ds.nonlinear.trees.binarytree.BinaryTree;
import ds.nonlinear.trees.binarytree.BinaryTreeNode;

public class BST<T extends Comparable> extends BinaryTree {

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
}
