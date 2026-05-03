package algo.backtracking;

import java.util.Arrays;

/**
 * Generate all the strings of n bits , assume A[0...n-1] is an array of size n
 */
public class BinaryStrings {
    int[] A;
    public BinaryStrings(int n) {
        A = new int[n];
    }
    public void binaryString(int n) {
        if (n <= 0) {
            System.out.println(Arrays.toString(A));
        }else{
            A[n-1] = 0;
            binaryString(n-1);
            A[n-1] = 1;
            binaryString(n-1);
        }
    }
    public static void main(String[] args) throws Exception{
        int n = 2;
        BinaryStrings strings = new BinaryStrings(n);
        strings.binaryString(n);
    }
}

/**
 * Output
 * [0, 0]
 * [1, 0]
 * [0, 1]
 * [1, 1]
 */