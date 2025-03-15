package src.ArraysAndHashing.indexoffirstoccurenceinstring;

import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
     var solution = new Solution();
     solution.strStr("sadbutsad","sad");
    }

    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) return -1;
        int i=0;
        int j =0;
        StringBuilder sb = new StringBuilder();
        for( j=0;j<needle.length();j++){
            sb.append(haystack.charAt(j));
        }
        // System.out.println(sb.toString());
        if(Objects.equals(sb.toString(), needle)) return i;
        while(j<haystack.length()){
            System.out.println(sb.toString());
            sb.append(haystack.charAt(j));
            sb.deleteCharAt(0);
            i++;
            j++;
            if(Objects.equals(sb.toString(), needle)) return i;

        }
        return -1;
    }
}
