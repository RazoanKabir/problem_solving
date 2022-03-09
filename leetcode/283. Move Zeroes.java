class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> moreThanZero = new ArrayList<Integer>();
        int zeroCount= 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){
                moreThanZero.add(nums[i]);
            } else 
                zeroCount++;
        }
        for(int i=0; i<zeroCount; i++){
            moreThanZero.add(0);
        }
       for(int i=0; i<nums.length;i++){
           nums[i]=moreThanZero.get(i);
       }
    }
}
