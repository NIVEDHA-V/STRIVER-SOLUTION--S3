class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        for(int i:arr)
            if(i==K)
                return 1;
        return -1;
    }
}
