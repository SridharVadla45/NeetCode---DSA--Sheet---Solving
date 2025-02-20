package src.ArraysAndHashing;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] prefix = new int[len];
        int [] suffix = new int[len];
        prefix[0]=nums[0];
        suffix[len-1]=nums[len-1];
        for(int i=1;i<len;i++){
            prefix[i]=nums[i]*prefix[i-1];
        }

        for(int i=len-2;i>=0;i--){
            suffix[i]=nums[i]*suffix[i++];
        }

        nums[0]=suffix[1];
        nums[len-1]=prefix[len-2];
        for(int i=1;i<len-1;i++){
            nums[i]=prefix[i-1]*suffix[i+1];
        }
        return nums;
    }

}
