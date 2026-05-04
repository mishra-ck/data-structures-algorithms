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

        System.out.println(binary.contains(40L));    // false
        System.out.println(binary.contains(50L));    // true

        System.out.println("Inorder traversal : " +binary.inOrder());
        System.out.println("Preorder traversal : " +binary.preOrder());
        System.out.println("Postorder traversal : " +binary.postOrder());

        /** Output :
         * Inorder Traversal : Left -> Root -> Right
         * Inorder traversal : [5, 10, 20, 25, 30, 50]
         * Preorder Traversal : Root -> Left -> Right
         * Preorder traversal : [20, 10, 5, 30, 25, 50]
         * PostOrder traversal : Left -> Right -> Root
         * Postorder traversal : [5, 10, 25, 50, 30, 20]
         */
    }
}
