public class stockbuysell {
    public static void main(String[] args)
    {
        int[] arr={7,1,5,3,6,4};
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {    
                sum=arr[j]-arr[i];
                if(maxsum<sum)
                {
                    maxsum=sum; 
                }
                sum=0;
                }
            }
        }
        if(maxsum<0)
            System.out.println("0");
        else
            System.out.println(maxsum);
    }
    
}
