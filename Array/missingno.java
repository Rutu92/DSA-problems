
public class missingno 
{
    public static void main(String [] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        for(int i=1;i<=n+1;i++)
        {
            int k=-1;
            for(int j=0;j<n;j++)
            {
                if(arr[j] == i)
                    k=0;
            }
            if(k==-1)
            {
                System.out.println(i);
                break;
            }
            
        }
    }  
}
