class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int size=nums.length;
        int[]result=new int[size];
        
        for(int i=0;i<size;i++){
            result[i]=1;
        }
        
        int prefix=1;
        for(int i=0;i<size;i++){
            result[i]=prefix;
            System.out.println(result[i]);
            prefix = prefix*nums[i];
        }
        
        int postfix=1;
        for(int i=size-1;i>=0;i--){
            result[i] *=postfix;
            postfix *=nums[i];
        }
        return result;
    }
}
