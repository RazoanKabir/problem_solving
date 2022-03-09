class Solution {
    public int climbStairs(int n) { 
        int[] i = new int[n+2];
        i[1] = 1;
        i[2] = 2;
        for (int j = 3; j <= n; j++) {
            i[j] = i[j - 1] + i[j - 2];
        }
        return i[n];
    } 
}
