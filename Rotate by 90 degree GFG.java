

//User function Template for Java

class GFG
{
    static void rotate(int arr[][]) 
    {
        // Code Here
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        int n=arr.length;
        int m=arr[0].length;
        int k=arr.length-1;
        for(int i=0;i<n/2;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[k][j];
                arr[k][j]=temp;
            }
            k--;
        }
    }
}
