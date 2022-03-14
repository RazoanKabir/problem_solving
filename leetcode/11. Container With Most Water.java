class Solution {
    public int maxArea(int[] h) {
      int result = 0;
      int f = 0;
      int s = h.length-1;
      int d = s;
      while(f < s) {
         int min = Math.min(h[f], h[s]);
         int length = s-f; 
         result = Math.max(result, min*length);
         if(h[f] < h[s]) 
             f++;
          else
              s--;    
      }  
      return result;
    }
}
