import java.util.*;
class pattern{
    public static void main(String args[])
    {
        int n=4,i=0,j=0;
        int arr[][]=new int[n][n];
        for(i=0;i<1;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=j+1;
            }
        }
        for(i=0;i<1;i++)
        {
            arr[i+1][0]=arr[i][0]+arr[i][n-1];
            for(j=0;j<n;j++)
            {
                arr[i][j]=j+1;
            }
            
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }


    }
}