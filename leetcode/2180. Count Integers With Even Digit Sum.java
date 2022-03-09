class Solution {
    int totalSum (int num) {
        return num==0 ? 0 : (num%10)+totalSum(num/10); 
    }
    public int countEven(int num) {
        int count =0;
        if(num<= 11) return num/2;
        for(int i=1; i<=num; i++) {
            if(totalSum(i)%2==0) count++;
        }
        return count;
    }
}
