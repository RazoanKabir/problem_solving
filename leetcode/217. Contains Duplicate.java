class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            a.add(nums[i]);
        }
        return a.size()<nums.length;
    }
}