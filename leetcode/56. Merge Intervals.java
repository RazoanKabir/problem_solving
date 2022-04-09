class Solution {
    public int[][] merge(int[][] i) {
        if (i.length == 1) {
            return i;
        }
        Arrays.sort(i, (int1, int2) -> Integer.compare(int1[0], int2[0]));
        
        List<int[]> result = new ArrayList<>();
        
        int size = i.length;
        int j = 0;
        while (j < i.length) {
            int f = i[j][0];
            int s = i[j][1];
            while (j < size && i[j][0] <= s) {
                
                s = Math.max(i[j][1], s);
                j++;
            }
            
            result.add(new int[]{f, s});
        }
        
        return result.toArray(new int[result.size()][]);
    }
}