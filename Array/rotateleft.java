public class rotateleft 
{
    public static void main(String [] args)
    {
        int [] arr={2,5,4,6,4,3};
        int n=arr.length;
        int k=arr[0];
        for(int i=0;i<n;i++)
        {
            if(i==(n-1))
            {
                arr[n-1]=k;
            }
            else{
                arr[i]=arr[i+1];
            }
        }
        for(int num: arr)
        {
            System.out.print(num+ " ");
        }
    }
}
