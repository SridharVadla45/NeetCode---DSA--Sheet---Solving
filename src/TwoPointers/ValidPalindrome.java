package src.TwoPointers;

public class ValidPalindrome {
//    Input: s = "A man, a plan, a canal: Panama"
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] schar = s.toCharArray();
        while (start < end) {
            while (start<end && !Character.isLetterOrDigit(schar[start])) start++;
            while (start<end && !Character.isLetterOrDigit(schar[end])) end--;
            if (!String.valueOf(schar[start]).toLowerCase().equals(String.valueOf(schar[end]).toLowerCase())) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
