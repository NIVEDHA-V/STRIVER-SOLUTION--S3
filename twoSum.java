class Solution {
    public int[] twoSum(int[] nums, int target) {
        int o[]= new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    o[0]=i;
                    o[1]=j;
                    break;
                }
            }
        }
        return o;
    }
}
