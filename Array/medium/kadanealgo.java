public class kadanealgo {
    public static void main(String[] args)
    {
        int [] arr={-2,-3,-7,-2,-10,-4};
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;

            for(int j=i;j<n;j++)
            {
                sum=sum+arr[j];
                maxsum=Math.max(maxsum,sum);
            }

        }
        System.out.println(maxsum);
    }
    
}
