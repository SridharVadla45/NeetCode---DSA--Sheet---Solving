package src.ArraysAndHashing.longestcommonancestor;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
     String result ="";
     if(strs.length==0) return result;
     int smallestLength =strs[0].length();
     for(String i:strs){
         smallestLength=Math.min(smallestLength,i.length());
     }

     for(int i=0;i<smallestLength;i++){
         char c  = strs[0].charAt(i);
         for(String s : strs){
             if(s.charAt(i)!=c) return result;
         }
         result+=c;
     }

     return result;
    }
}
