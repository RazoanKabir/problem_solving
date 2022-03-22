class Solution {
    public int kthSmallest(int[][] m, int k) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i< (m.length*m[0].length); i++) {
            int row = i / m[0].length;
            int col = i % m[0].length;
            arr.add(m[row][col]);
        }
        Collections.sort(arr);
        return arr.get(k-1);  
    }
}
