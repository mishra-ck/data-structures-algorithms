package ds.nonlinear.trees.binarytree;

import java.util.ArrayDeque;
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
        inorderRecursive(root,result);  // recursive way
        inorderIterative(root);  // iterative way
        return result;
    }
    // Recursive approach
    private void inorderRecursive(BinaryTreeNode<T> node, List<T> result) {
        if(node == null) return;
        inorderRecursive(node.getLeft(),result);
        result.add(node.getValue()); // add current node value in list
        inorderRecursive(node.getRight(),result);
    }
    // Iterative approach
    private void inorderIterative(BinaryTreeNode<T> node){
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
        preOrderRecursive(root, result);
        return result;
    }
    // Recursive Approach
    private void preOrderRecursive(BinaryTreeNode<T> node, List<T> result) {
        if(node == null) return;
        result.add(node.getValue());
        preOrderRecursive(node.getLeft(),result);
        preOrderRecursive(node.getRight(),result);
    }
    // Iterative Approach
    public void preOrderIterative(BinaryTreeNode<T> node){
        if(node == null) return ;

        var stack = new ArrayDeque<BinaryTreeNode<T>>();
        stack.push(node);

        while(!stack.isEmpty()){
            var current = stack.pop();
            System.out.println("Current Value : "+current.getValue());

            // push the right child first
            if(current.getRight() != null){
                stack.push(current.getRight());
            }
            // push left child second
            if(current.getLeft() != null){
                stack.push(current.getLeft());
            }
        }
    }

    /**  PostOrder traversal : Left -> Right -> Root  - Used for tree deletion  */
    public List<T> postOrder(){
        List<T> result = new ArrayList<>();
        postOrderRecursive(root, result);
        return result;
    }
    // Recursive approach
    private void postOrderRecursive( BinaryTreeNode<T> node,List<T> result) {
        if(node == null) return;
        postOrderRecursive(node.getLeft(), result);
        postOrderRecursive(node.getRight(), result);
        result.add(node.getValue());
    }


    @Override
    public int compareTo(T o) {
        return 0;
    }
}
