class Solution{
    public static int lenOfLongSubarr (int A[], int N, int K) {
        int l=0,r=0,s=A[0],m=0;
        while(r<N){
            while(s>K&&l<=r){
                s-=A[l];
                l++;
            }
            if(s==K){
                m=Math.max(m,r-l+1);
            }
            r++;
            if(r<N)
            s+=A[r];
        }
        return m;
    }    
}


