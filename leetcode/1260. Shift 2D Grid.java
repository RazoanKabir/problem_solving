class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0; i<r*c; i++) {
            int row = i/c;
            int col = i%c;
            l.add(grid[row][col]);
        }
        for(int i=0; i<k; i++) {
            int a = l.get(l.size()-1);
            l.remove(l.size()-1);
            l.add(0, a); 
        }
        int a = 0;
        for(int i = 0; i < r; i++){
            List<Integer> row = new ArrayList<>();
            result.add(row);
                for(int j = 0; j < c; j++){
                row.add(l.get(a++));
            }
        }
        return result;
    }
}