package ds.nonlinear.trees.binarytree;

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

    /**  Inorder Traversal : Left -> Root -> Right - gives sorted output */

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
