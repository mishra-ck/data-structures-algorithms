Binary Tree 
---
A Binary Tree is a hierarchical data structure where each node has at most two children, 
known as the left child and the right child.
---
### Binary Tree Node Implementation
```java 

public class BinaryTreeNode<T> implements TreeNode<T> {
    
    private T value;
    private BinaryTreeNode<T> left;
    private BinaryTreeNode<T> right;
    
    public BinaryTreeNode(T value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public BinaryTreeNode(T value, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public T getValue(){ return value;}
    public void setValue(T value){ this.value = value; }
    
    public BinaryTreeNode<T> getLeft(){ return left ;}
    public void setLeft(BinaryTreeNode<T> left){ this.left = left ;}
    
    public BinaryTreeNode<T> getRight(){ return right; }
    public void setRight(BinaryTreeNode<T> right){ this.right = right ;}
    
    public boolean isLeaf(){
        return left == null && right == null;
    }
    @Override
    public String toString(){
        return "Node("+ value + ")";
    }
    
}

```