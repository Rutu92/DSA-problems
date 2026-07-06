public class reversearray {
    public static void main(String args[])
    {
        int [] arr ={1,2,3,4,5};
        int n=arr.length;
        fun(arr, 0,n-1);
    }
    static void fun(int [] arr,int l,int r)
    {
        if(l>=r)
        {
            for(int x : arr)
            {
                System.out.print(x + " ");
            }
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        fun(arr,l+1,r-1);
    }
}
