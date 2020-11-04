package Sequence;

import java.util.ArrayList;

public class Seq {

    public static ArrayList<Integer> memory = new ArrayList<>(1000);


//    solution a recursive approach
    public static int seqR(int n){
        int a0 = 2;
        int a1 = 3;
        // if the value of n is 0 or 1 then i will simply return that value
        if (n == 0)
            return a0;
        else if (n == 1)
            return a1;
        else
            return seqR(n-1) + seqR(n-2);  // if n > 1
    }

//    solution b recursive and memorisation approach
    public  static int seqM(int n){
//        initialising our memory
        if (memory.isEmpty()){
            memory.add(0,2);
            memory.add(1,3);
            for(int i=2;i<1000;i++){
                memory.add(i,0);
            }
        }
        if (n==0){
            return memory.get(n);
        }
        else if (n==1){
            return memory.get(n);
        }
//        if n index is present in the memory then i will return the value across that index from the memory
//        that means if the value is already calculated then use it
        else if (memory.get(n) != 0){
            return memory.get(n);
        }
        else {
//            adding value at the next available space in the memory and this value will be the sum of previous two value from the memory
//            memory.add(memory.get(memory.size()-1) + memory.get(memory.size()-2));
            memory.add(n,seqM(n-1) + seqM(n-2));
            return memory.get(n);
        }

    }

//    solution c iterative approach
    public static int seqI(int n){
        int []arr = new int[n+2];
        arr[0] = 2;
        arr[1] = 3;
        if (n==0){
            return arr[0];
        }
        else if (n==1){
            return arr[1];
        }
        else {
            for (int i=2;i<=n+1;i++){
                arr[i] = (arr[i-2] + arr[i-1]);
            }
            return arr[n];
        }
    }
}
