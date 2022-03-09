class Solution {
    public int search(int[] nums, int target) {
      return searchDigit(0, nums.length-1, nums, target);
    }
    int searchDigit(int low, int high, int[] arr, int target) {
        if (high >= low && low <= arr.length - 1) {
            int mid = low+(high-low)/2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) return searchDigit(low, mid - 1, arr,target);
            return searchDigit(mid + 1, high, arr, target);
        }
        return -1;  
    }
}
