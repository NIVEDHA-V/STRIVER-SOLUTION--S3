class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        for(int i:nums)
            s+=i;
        int t=nums.length*(nums.length+1)/2;
        return t-s;
    }
}
