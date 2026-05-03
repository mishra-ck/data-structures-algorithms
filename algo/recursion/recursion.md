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
### Memory Visualization


---