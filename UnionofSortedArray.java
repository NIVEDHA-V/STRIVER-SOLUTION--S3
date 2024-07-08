class Solution
{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> l=new ArrayList();
        int i=0,j=0;
        while(i<n&&j<m){
            while(i<n-1&&arr1[i]==arr1[i+1]){
                i++;
            }
            while(j<m-1&&arr2[j]==arr2[j+1]){
                j++;
            }
            if(arr1[i]<arr2[j]){
                l.add(arr1[i]);
                i++;
            }else if(arr1[i]>arr2[j]){
                l.add(arr2[j]);
                j++;
            }else{
                l.add(arr1[i]);
                i++;j++;
            }
        }
        while(i<n){
            while(i<n-1&&arr1[i]==arr1[i+1]){
                i++;
            }
            l.add(arr1[i]);
            i++;
        }
        while(j<m){
            while(j<m-1&&arr2[j]==arr2[j+1]){
                j++;
            }
            l.add(arr2[j]);
            j++;
        }
        return l;
    }
}
