class Solution {
    fun fairCandySwap(aliceSizes: IntArray, bobSizes: IntArray): IntArray {
        val aliceSum = aliceSizes.sum()
        val bobSum = bobSizes.sum()
        val target = (aliceSum - bobSum) / 2
        val bobSet = bobSizes.toHashSet()
        val aliceSet = aliceSizes.toHashSet()
        var x: Int = 0
        var y: Int = 0
        for (a in aliceSet) {
            if (bobSet.contains(a - target)){
                x=a;
                y=a-target
            }
        }
        return intArrayOf(x,y)
    }
}
