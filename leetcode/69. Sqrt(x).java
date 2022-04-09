class Solution {
    public int mySqrt(int x) {
        long first = 1;
        long last = x/2;
        if(x == 1){
            return 1;
        }
        while(first <= last){
            long mid = first + (last - first) /2;
            if(mid * mid == x) return (int)mid;
            else if(mid * mid > x) last = mid-1;
            else first = mid+1;    
        }
        return (int)last;
    }
}