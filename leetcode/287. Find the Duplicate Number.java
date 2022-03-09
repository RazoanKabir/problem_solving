class Solution {
    public int findDuplicate(int[] nums) {
        int[] check = new int[nums.length];
        int i=0;
        while(check[nums[i]] == 0) {
            check[nums[i]] = -1;
            i++;
        }
        return nums[i];
    }
}
