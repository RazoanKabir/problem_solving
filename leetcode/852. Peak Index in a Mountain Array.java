class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return (bS(arr, 0, arr.length-1));
    }
    private int bS(int[] arr, int low, int high) {
       int mid = (low + high)/2;
       if ( arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
       return mid; 
       if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1])
         return bS(arr, low, mid-1);
       else 
         return bS(arr, mid + 1, high); 
    } 
}
