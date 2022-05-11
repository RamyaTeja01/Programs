class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int c=0;
        int[] arr=new int[m];
        for(int i=0;i<m;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
            }
            arr[i]=c;
        }
        
        int[] arr1=new int[k];
        for(int i=0;i<k;i++)
        {
           int min=Integer.MAX_VALUE;
            int minIndex=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    minIndex=j;
                }
            }
            arr1[i]=minIndex;
            arr[minIndex]=Integer.MAX_VALUE;
        }
        return arr1;
        
    }
}
