class Solution {
    public boolean isPerfectSquare(int num) {
    if(num == 2 || num == 1) return true;
    if(num == 2147483647) return false;    
    long first = 0;
    long last = num;    
    if(last > 1000000) last = last/1000;    
    else if(last > 10000) last = last/100;    
    while(first<= last){
        long mid = first + (last - first)/2;
    
        if(mid*mid == num){
            return true;
        }else if(mid*mid > num){
            last = mid-1;
        }else{
            first = mid+1;
        }
    }
    return false;
 }
}
