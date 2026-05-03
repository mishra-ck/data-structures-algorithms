package algo.recursion;
public class Factorial{
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
