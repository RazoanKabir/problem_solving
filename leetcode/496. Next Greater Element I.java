class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];
        for(int i=0; i< nums2.length; i++) {
            map.put(i, nums2[i]);
        }
        for(int i=0; i< nums1.length; i++) {
            if(map.containsValue(nums1[i])) {
                int key= -1;
                for(Map.Entry<Integer, Integer> el : map.entrySet()) {
                    if(el.getValue()== nums1[i]) {
                        key= el.getKey();
                        break;
                    }
                }
                for(Map.Entry<Integer, Integer> el : map.entrySet()) {
                    if(el.getValue() > nums1[i] && el.getKey() > key) {
                        System.out.println(el.getKey()+" & "+el.getValue());
                        result[i] = el.getValue();
                        break;
                    } else {
                        result[i] = -1;
                    }
                }
            } else 
                result[i] = -1;
        }  
        
        return result;
    }
}
