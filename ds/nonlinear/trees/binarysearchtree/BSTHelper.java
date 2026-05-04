package ds.nonlinear.trees.binarysearchtree;

import ds.nonlinear.trees.binarytree.BinaryTreeNode;

public class BSTHelper {
    public static void main(String[] args) {
        BST<Long> binary = new BST<>();
        binary.insert(20L);
        binary.insert(30L);
        binary.insert(10L);
        binary.insert(50L);
        binary.insert(25L);
        binary.insert(5L);

        System.out.println(binary.contains(40L));
        System.out.println(binary.contains(50L));

        System.out.println("Inorder traversal : " +binary.inOrder());
        System.out.println("Preorder traversal : " +binary.preOrder());
        System.out.println("Postorder traversal : " +binary.postOrder());
    }
}
