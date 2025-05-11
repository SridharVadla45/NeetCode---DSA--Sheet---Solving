package src.recursion.isSubsequence;

public class Solution  {
    public static void main(String[] args) {
        boolean result = new Solution().isSubsequence("abc","abc");
        System.out.println(" Result :"+  result);
    }
    public  boolean isSubsequence(String s, String t) {
        if (helper(s,t,"",0)) return  true;
        return  false;
    }

    private boolean helper(String s ,String t,String temp,int index)
    {
        if(index>=t.length()){
            System.out.println(temp);
            if(temp.equals(s))return true;
            return false;
        }
        if(helper(s,t,temp,index+1)) return true;
        if(helper(s,t,temp+t.charAt(index),index+1)) return true;
        return false;
    }
}
