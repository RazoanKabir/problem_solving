class Solution {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();
        String[] split = s.split(":");
        char fs = split[0].charAt(0);
        char ss = split[1].charAt(0);
        int li = split[0].charAt(0);
        int fi = (int) Character.getNumericValue(split[0].charAt(1));
        int si = (int)Character.getNumericValue(split[1].charAt(1));
        int temp = fi;

        while(li <= split[1].charAt(0)) {
            result.add((char)li+String.valueOf(temp));
            if(temp == si) {
                li++;
                temp = fi;
            } else 
                temp++;
        }
        return result;
    }
}
