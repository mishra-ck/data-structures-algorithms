package ds.nonlinear.trees.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeImpl<T> implements Comparable<T>{
    protected BinaryTreeNode<T> root;
    protected int size;
    public BinaryTreeImpl() {
            this.root = null;
            this.size = 0;
    }
    /** Height of tree : O(n) time, O(h) space (recursion stack) */
    public int height(){
        return heightHelper(root);
    }
    private int heightHelper(BinaryTreeNode<T> node){
        if(node == null) return -1; // height of empty tree
        return 1+ Math.max(heightHelper(node.getLeft()), heightHelper(node.getRight()));
    }
    /**  check if tree is empty  */
    public boolean isEmpty(){ return root == null;}

    /**  Tree Traversals( Inorder/Preorder/Postorder/LevelOrder )  */

    /**  Inorder Traversal : Left -> Root -> Right - gives sorted output */
    public List<T> inOrder(){
        List<T> result = new ArrayList<>();
        inorderRecursiveHelper(root,result);  // recursive way
        inorderIterativeHelper(root);  // iterative way
        return result;
    }
    // Recursive approach
    private void inorderRecursiveHelper(BinaryTreeNode<T> node, List<T> result) {
        if(node == null) return;
        inorderRecursiveHelper(node.getLeft(),result);
        result.add(node.getValue()); // add current node value in list
        inorderRecursiveHelper(node.getRight(),result);
    }
    // Iterative approach
    private void inorderIterativeHelper(BinaryTreeNode<T> node){
        if(node == null) return;
        Stack<BinaryTreeNode<T>> stack = new Stack<>();
        BinaryTreeNode<T> current = node;

        while(current != null && (!stack.isEmpty())){
            // 1. Go to left most of the current node
            while(current != null ){
                stack.push(current);
                current = current.getLeft();
            }
            // 2. current will null by now, pop the item
            current = stack.pop();
            System.out.println("Visited node : "+ current.getValue());
            // 3. Visited left now go right
            current = current.getRight();
        }
    }

    /** Preorder Traversal : Root -> Left -> Right  - used for tree copying */
    public List<T> preOrder(){
        List<T> result = new ArrayList<>();
        preOrderHelper(root, result);
        return result;
    }
    // Recursive Approach
    private void preOrderHelper(BinaryTreeNode<T> node, List<T> result) {
        if(node == null) return;
        result.add(node.getValue());
        preOrderHelper(node.getLeft(),result);
        preOrderHelper(node.getRight(),result);
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
