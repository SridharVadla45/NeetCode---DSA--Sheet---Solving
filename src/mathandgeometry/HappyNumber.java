package src.mathandgeometry;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true){
            int temp = getSumOfSquares(n);
            if(temp==1) return true;
            if(set.contains(temp)) return false;
            n=temp;
            set.add(temp);
        }
    }

    private static boolean betterSolution(int n){
        int slow =n;
        int fast =n;
        do {
            slow = getSumOfSquares(slow);
            fast=getSumOfSquares(getSumOfSquares(fast));
        }while(slow!=fast);
        return slow==1;
    }

    private static int getSumOfSquares(int n){
        int num =0;
        while(n!=0){
            int digit = n%10;
            num+=digit*digit;
            n/=10;
        }
        return num;
    }

}
