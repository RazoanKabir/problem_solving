class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
       var result: IntArray = intArrayOf() 
        var targetFirstPart: Int? = null
        for(i in 0 until nums.size-1){
            targetFirstPart = target - nums[i]
            for(j in i+1 until nums.size) {
                if(nums[j] == targetFirstPart) {
                    result = intArrayOf(i,j)
                }	
            }  
        }
        return result
    }
}
