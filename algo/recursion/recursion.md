Recursion
---
---
### What is Recursion ?
Any function that calls itself is `recursive`.

A recursive method solves a problem by calling a copy of itself to work on small problem.
This is called `recursion step`.

The recursion step can result in many such recursive calls, it is important to ensure that recursion terminates.

The sequence of smaller problems must eventually converge on the `base case`.

---
### Format of Recursive Function ?
A recursive function performs a task in a part by calling itself to perform the subtasks, called as `recursive case`.
At some point , the function encounters a subtask that it can perform without calling itself, called as `base case`.

```
if(test for base case)
    return base value
else if(test for another base)
    return other base value
else 
    return some work and then a recursive call
    
Ex: Factorial 
n! = 1                  if n = 0 
n! = n * (n-1)!         if n > 0

```
```java
class Factorial{
    public static long factorial(long number){
        if(number <= 1)
            return 1;   // base case ( 0! = 1 , 1! = 1)
        else 
            return number * factorial(number - 1);   // recursive case
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
```
---
### Memory Visualization
![factorial.png](https://github.com/mishra-ck/data-structures-algorithms/blob/main/algo/recursion/factorial.png)

---
### Recursion vs Iteration 

Recursion :-
1. Terminates when base case is reached.
2. Each recursive call requires extra space on stack frame.
3. If we get infinite recursion, may get out of memory(Stack overflow)
4. Solution to some problems are easy to formulate recursively.

Iteration :-
1. Terminates when condition is proven to be false.
2. Each iteration does not require any extra space.
3. An infinite loop can loop forever as no extra space is created.
4. Iterative solutions are not as obvious as recursive solutions.

---
### Example Algorithms of Recursion
1. Fibonacci Series, Factorial 
2. Merge & Quick sorts
3. Binary Search
4. Tree traversals (Inorder/Preorder/Postorder)
5. Graph traversals (BFS/DFS)
6. DP and Divide and Conquer Algorithms
7. Towers of Hanoi
8. Backtracking algorithms.
---