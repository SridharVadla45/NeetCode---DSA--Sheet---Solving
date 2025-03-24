package src.ArraysAndHashing.addbinary;

public class Solution {
    public String addBinary(String a, String b) {
        int j = b.length();
        int i = a.length();
        int carry =0;
        String result = "";
        while(i>=0 && j>=0){
            int ci = a.charAt(i)-48;
            int cj=b.charAt(j)-48;
            int sum = ci ^ cj^carry;
            result=sum+result;
            carry=(ci & cj) ^ carry;
        }
        while(i>=0){
            int ci = a.charAt(i)-48;
            int sum = ci ^carry;
            result=sum+result;
            carry=ci ^ carry;
        }
        while(j>=0){
            int cj = b.charAt(i)-48;
            int sum = cj ^carry;
            result=sum+result;
            carry=cj ^ carry;
        }
        if(carry>0) result=carry+result;
        return result;
    }
}
