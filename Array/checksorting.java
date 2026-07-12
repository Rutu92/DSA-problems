public class checksorting {
    public static void main(String[] args)
    {
        int [] arr={6,5,4,3,2,1};
        int n=arr.length;
        int p=-1;
        boolean swapped= false;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swapped=true;
                }
            }
            if( !swapped)
            {
                p=0;
                break;
            }
        }
    if(p==-1)
    {
        System.out.println("not sorted, "+ !swapped);
    }
    else
    {
        System.out.println("sorted array in ascending order, "+ !swapped);
    }
}
}
