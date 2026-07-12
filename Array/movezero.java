public class movezero {
    public static void main(String[] args)
    {
        int[] arr= {2,4,0,5,0,3,7,8,0,0,4};
        int n=arr.length;
        int k=0;
        int l=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                k++;
            }
            else
            {
                arr[l]=arr[i];
                l++;
            }
        }
        for(int i=l;i<n;i++)
        {
            arr[l]=0;
            l++;
        }
        for(int num: arr)
        {
            System.out.print(num+ " ");
        }
    }
}
