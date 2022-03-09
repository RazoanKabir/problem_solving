class Solution {
    public int removeDuplicates(int[] nums) {
        int current = -100000;
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(current < nums[i]){
                count=1;
                current = nums[i];
            } else if(current==nums[i]){
                count++;
                if(count > 2) {
                    for(int j=i; j< nums.length; j++){
                        nums[i]= -100000;
                    }
                }
            }  
        }
    int j = 0;
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] != -100000) {
			int temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;
			j++;
		}
	}
        return j;
    }
}
