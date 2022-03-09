class Solution {
     public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[arr.length]; 
        int[] temp=arr.clone();
        Arrays.sort(temp);
        int j=1;
        for(int i=0;i<temp.length;i++){
            if(!map.containsKey(temp[i])) map.put(temp[i],j++);
        }
        for(int i=0;i<arr.length;i++){
            result[i]=map.get(arr[i]);
        }
        return result;
    }
}
