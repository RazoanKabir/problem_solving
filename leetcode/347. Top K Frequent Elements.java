class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1) return nums;
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a,b)->{return b.getValue()-a.getValue();});
        for(int n: nums) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n)+1);
            } else {
                map.put(n, 1);
            }
        }
        for(Map.Entry<Integer, Integer> el: map.entrySet()) {
           q.add(el);
        }
        while(k != 0) {
            result[k-1] = q.poll().getKey();
            k--;      
        }
        return result;
    }
}