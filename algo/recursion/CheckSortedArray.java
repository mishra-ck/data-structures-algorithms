package algo.recursion;

public class CheckSortedArray {

    public static boolean isArraySorted(int[] array, int index){
        if( array.length == 1 || index ==1 ){
            return true;
        }
        return (array[index-1] < array[index-2]) ? false : isArraySorted(array,index-1);
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7};
        int[] B = {1,2,5,4,0,6,7};
        System.out.println("Is array sorted : " + isArraySorted(A,7)); // true
        System.out.println("Is array sorted : " + isArraySorted(B,7)); // false

    }
}
