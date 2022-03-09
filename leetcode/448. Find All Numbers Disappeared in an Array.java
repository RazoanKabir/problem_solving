class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int size = nums.length;
        List<Integer> result =new ArrayList<>();
        for(int i=0;i<size;) {
            if(nums[i]==i+1) {                
                i++;
                continue;
            }
            else if(nums[i] == nums[nums[i]-1]) {
                i++;
                continue;
            }
            int temp = nums[i];
            nums[i] = nums[nums[i]-1];
            nums[temp-1] = temp;
        }
        for(int i = 0; i< size; i++) {
            if(nums[i] != i+1) result.add(i+1);
        }
        return result;
    }
}
