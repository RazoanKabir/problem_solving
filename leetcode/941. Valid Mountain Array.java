class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
        return false;
    }
    
    int increment = 1;
    for(int i=0; i<arr.length-1; i++){
        if((arr[i] == arr[i+1]) && (increment == 1)){
            return false;
        }else if((arr[i] > arr[i+1]) && (increment == 1)){
            if(i == 0)
                return false;
            increment = 0;
        }else if((arr[i]<=arr[i+1]) && (increment == 0)){
            return false;
        }
    }
    
    if(increment == 1)
        return false;
    
    return true;
    }
}