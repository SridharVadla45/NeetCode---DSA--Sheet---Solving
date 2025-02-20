package src.ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        for(String s : strs){
            boolean flag = false;
            if(!ans.isEmpty()){
                for(List<String> list :ans){
                    String t= list.get(0);
                    if(isAnagram(s,t)){
                        list.add(s);
                        flag=true;
                        break;
                    }
                }
            }
            if(!flag) {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(s);
                ans.add(temp);
            }
        }

        return ans;

    }

    public static  boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        int [] frequency = new int[26];
        for(int i=0;i<s.length();i++){
            frequency[s.charAt(i)-'a']++;
            frequency[t.charAt(i)-'a']--;
        }
        for(int i :frequency){
            if(i>0) return false;
        }
        return true;
    }
}
