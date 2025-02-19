package src;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        isAnagram("hello","lllll");
    }
    public static boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()) return false; // early exit
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char c : s.toCharArray()){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!hashMap.containsKey(c)) return false;
            hashMap.put(c, hashMap.get(c)-1);
            if(hashMap.get(c)==0) hashMap.remove(c);
        }

        return hashMap.size()==0;
    }
}
