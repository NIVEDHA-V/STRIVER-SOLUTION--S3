
//Using MAP
        // HashMap<Integer, Integer> m = new HashMap();
        // for (int i : nums) {
        //     if (m.containsKey(i))
        //         m.put(i, m.get(i) + 1);
        //     else
        //         m.put(i, 1);
        // }
        // int x = 0;
        // for (Map.Entry<Integer, Integer> e : m.entrySet()) {
        //     if (e.getValue() == 1) {
        //         x = e.getKey();
        //     }

        // }
        // return x;

//BIT MANIPULATION
class Solution {
    public int singleNumber(int[] nums) {
        int r=0;
        for(int i:nums){
            r^=i;
        }
        return r;
    }
}
