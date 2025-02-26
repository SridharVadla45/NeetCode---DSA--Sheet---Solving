package src.bitmanuplation;

import java.util.Arrays;

public class ReverseBits {
    // you need treat n as an unsigned value

    public int reverseBits(int n) {
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            // Get the rightmost bit of n
            int rightmostBit = n & 1;

            // Shift the reversed bits to the left to make space for the new bit
            reversed <<= 1;

            // Place the rightmost bit of n at the rightmost position of reversed
            reversed |= rightmostBit;

            // Shift n to the right to process the next bit
            n >>>= 1; // Use unsigned right shift (>>>)
        }
        return reversed;
    }

    // public int reverseBits(int n) {
    //   return binaryToInteger(convertToBinary(n));
    // }

    private static int [] convertToBinary(int n){
        int [] bits = new int[32];
        int i=31;
        while(i>=0){
            if((n&1)==1) bits[i]=1;
            n>>=1;
            i--;
        }
        return bits;
    }


    private static  int binaryToInteger(int [] bits){
        int sum=0;
        for(int i=0;i<32;i++){
            sum+=bits[i]*(1<<i);
        }
        return sum;
    }
}
