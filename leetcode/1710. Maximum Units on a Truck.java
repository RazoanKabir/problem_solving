class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int max = 0;
        Arrays.sort(boxTypes, Comparator.comparingDouble(a -> a[1]));
        for(int i=boxTypes.length-1; i>=0; i--){
            int[] box= boxTypes[i];
            if(truckSize > box[0]){
                max = max+ box[0]*box[1];
                truckSize = truckSize - box[0];
            } else {
                max = max + truckSize*box[1];
                break;    
            }
        }
        return max;  
    }
}
