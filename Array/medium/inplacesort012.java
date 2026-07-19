public class inplacesort012 {
    public static void main(String [] args)
    {
        int [] arr={0,0,1,2,1,0,0,2};
        int n=arr.length;
        int p=0,q=0,r=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
                p++;
            else if(arr[i]==1)
                q++;
            else
                r++;
        }
        for(int j=0;j<n;j++)
        {
            int k=j;
            while(k<p)
            {
                arr[k]=0;
                k++;
            }
            while(k<(p+q))
            {
                arr[k]=1;
                k++;
            }
            while(k<(p+q+r))
            {
                arr[k]=2;
                k++;
            }

        }
        for(int num: arr)
        {
            System.out.print(num+ " ");
        }
    }
}
