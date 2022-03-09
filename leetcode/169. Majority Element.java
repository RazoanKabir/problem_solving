class Solution {
    public int majorityElement(int[] nums) {
        int max = -Integer.MAX_VALUE;
        int result = 0;
        HashMap<Integer, Integer> check = new HashMap<>();
        for(int i=0; i<nums.length;i++) {
            if(check.containsKey(nums[i])) check.put(nums[i], check.get(nums[i])+1);
            else check.put(nums[i], 1);
        }
        for(HashMap.Entry<Integer, Integer> el: check.entrySet()) {
            if(el.getValue() > max) {
                max = el.getValue();
                result = el.getKey();
            }
        }
        return result;
    }
}
