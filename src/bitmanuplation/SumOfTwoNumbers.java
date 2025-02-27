package src.bitmanuplation;

import java.util.Arrays;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        bruteSolution(2, 3);
    }

    public int getSum(int a, int b) {
        return a + b;
    }


    private static int bruteSolution(int a, int b) {
        int[] aBits = convertToBinary(a);
        int[] bBits = convertToBinary(b);
        int[] ans = new int[32];
        int carry = 0;
        for (int i = 31; i >= 0; i--) {
            int sum = aBits[i] ^ bBits[i] ^ carry;
            ans[i] = sum;
            carry = aBits[i] & bBits[i] | aBits[i] & carry | bBits[i] & carry;
        }


        return binaryToDecimal(ans);
    }


    private static int[] convertToBinary(int n) {
        int[] bits = new int[32];
        int i = 31;
        while (n > 0) {
            if ((n & 1) == 1) bits[i] = 1;
            i--;
            n >>= 1;
        }
        return bits;
    }


    private static int binaryToDecimal(int[] bits) {
        int num = 0;
        for (int i = 31; i >= 0; i--) {
            num += bits[i] * (1 << (31 - i));
        }
        return num;
    }

}
