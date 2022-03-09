class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        int[] lookUpTable = new int[256];
        lookUpTable[0] = 0;
        for (int i = 0; i < 256; i++) {
            lookUpTable[i] = (i & 1) + lookUpTable[i / 2];
        }
        for(int i=0; i<=n; i++) {
           result[i] = lookUpTable[i & 0xff]+ lookUpTable[(i >> 8) & 0xff]+ lookUpTable[(i >> 16) & 0xff]+ lookUpTable[i >> 24]; 
        }
        return result;
    }
}
