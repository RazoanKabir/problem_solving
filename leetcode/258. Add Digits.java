class Solution {
    public int addDigits(int num) {
        int result = -1;
        if(num==0) return 0;
        if(num > 0 && num < 10) return num;
        if(num%9 == 0) result = 9;
        else result = num%9;
        return result;      
    }
}
