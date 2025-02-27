package src.bitmanuplation;

public class MissingNumber {
    public int missingNumber(int[] nums) {
     return bruteSolution(nums);
    }

    private static int bruteSolution(int [] nums){
        int n=nums.length;
        int sum = n*(n+1)/2;
        int temp=0;
        for(int i :nums){
            temp+=i;
        }
        return sum-temp;

    }




}
