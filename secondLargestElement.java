class Solution {
    public int print2largest(List<Integer> arr) {
        int m2=-1;
        int m1=Integer.MIN_VALUE;
        for(int i:arr)
            if(i>m1)
                m1=i;        
        for(int i:arr)
            if(i>m2&&i!=m1)
                m2=i;
        return m2;
    }
}
