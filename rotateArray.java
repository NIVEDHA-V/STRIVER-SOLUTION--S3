class Solution {
    public static int[] rev(int[] n,int s,int e){
        while(s<e){
            int temp=n[s];
            n[s]=n[e];
            n[e]=temp;
            s++;e--;
        }
        return n;
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
}
