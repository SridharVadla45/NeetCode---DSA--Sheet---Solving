package src.binarysearch;

public class SearchElement {
    public int search(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
            mid = start + (end - start) / 2;
        }
        return index;
    }
}
