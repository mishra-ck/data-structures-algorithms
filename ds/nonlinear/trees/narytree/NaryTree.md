N-Ary Tree (General Tree)
---
---
An N-ary tree is a rooted tree where each node can have at most N children.
N-ary tree allows for a more flexible, hierarchical structure—perfect for representing file systems, organizational charts, or HTML DOM structures.

---
### N-Ary Tree Node Implementation

```java

import java.util.ArrayList;
import java.util.List;

public class NaryTreeNode<T> {

    private T value;
    private List<NaryTreeNode<T>> children;

    public NaryTreeNode(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
    // get value at node
    public T getValue() {
        return value;
    }
    // children nodes
    public List<NaryTreeNode<T>> getChildren(){
        return children;
    }
    // add child
    public void addChild(NaryTreeNode<T> child){
        children.add(child);
    }
    // is leaf node
    public boolean isLeaf(){
        return children.isEmpty();
    }
}

```