class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] check = new int[nums.length+1];
        for(int i=0; i< nums.length; i++) {
            int value = nums[i];
            check[value]++;
        }
        for(int i=0; i<check.length; i++) {
            if(check[i] == 2) result[0] = i;
            else if(check[i]==0) result[1] = i;
        }
        
        return result;
            
    }
}
