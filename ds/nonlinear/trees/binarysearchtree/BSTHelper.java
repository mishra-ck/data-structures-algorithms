package ds.nonlinear.trees.binarysearchtree;

import ds.nonlinear.trees.binarytree.BinaryTreeNode;

public class BSTHelper {
    public static void main(String[] args) {
        BST<Long> binary = new BST<>();
        binary.insert(20L);
        binary.insert(30L);
        binary.insert(10L);
        binary.insert(50L);
        System.out.println(binary.contains(40L));
        System.out.println(binary.contains(50L));

    }
}
