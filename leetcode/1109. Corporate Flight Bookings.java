class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr = new int[n]; 
        for(int i=0;i<n;i++){
            arr[i] = 0;
        }
        for(int i=0;i<bookings.length;i++){
            for(int j=bookings[i][0]-1;j<=bookings[i][1]-1;j++){
                arr[j] = arr[j]+bookings[i][2];
            }
        }
        return arr;
    }
}
