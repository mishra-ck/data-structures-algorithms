package algo.recursion;

/**
 * Base Case:
 * If there's only one disk (n == 1), move it directly from source to destination.
 * Recursive Case:
 * Step 1: Recursively move n-1 disks from source to auxiliary, using destination as the temporary rod.
 * Step 2: Move the largest disk (the n-th disk) from source to destination.
 * Step 3: Recursively move the n-1 disks from auxiliary to destination, using source as the temporary rod.
 */
public class TowerOfHanoi {

    public static void towerOfHanoi(int n,char from , char to, char aux){
        // Base case : if there is only one disk, move it
        if(n == 1){
            System.out.println(new Move(n, from, to));
            return;
        }
        /** 1. Move n-1 disk from source to auxiliary */
        towerOfHanoi(n-1, from, aux, to);
        /** 2. Move the nth disk from source to destination  */
        System.out.println(new Move(n, from , to));
        /** 3. Move the n-1 disk from auxiliary to destination */
        towerOfHanoi(n-1,aux,to,from);
    }

    public static void main(String[] args) {
        int disk = 3;
        System.out.println("Solving Tower of Hanoi for "+ disk + " disks");
        towerOfHanoi(disk, 'A','B','C');
    }
}
record Move(int disk, char from, char to){
    public String toString(){
        return "Move disk : "+ disk +" from -> "+ from +" to "+ to ;
    }
}

/** Output :
 * Solving Tower of Hanoi for 3 disks
 * Move disk : 1 from -> A to B
 * Move disk : 2 from -> A to C
 * Move disk : 1 from -> B to C
 * Move disk : 3 from -> A to B
 * Move disk : 1 from -> C to A
 * Move disk : 2 from -> C to B
 * Move disk : 1 from -> A to B
 */