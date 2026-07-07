public class SelectionSort 
{
    public static void main(String [] args)
    {
        int []arr={54,75,1,34,54,89,16};
        selection(arr);
        for(int num: arr)
        {
            System.out.println(num +" ");
        }
    }
    static void selection(int[] arr)
    {
        int n=arr.length;
        for(int i=0; i<n-1; i++)
        {
            int minindex=i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex=j;
                }
            }
            if(minindex != i)
            {
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }
    }
}

