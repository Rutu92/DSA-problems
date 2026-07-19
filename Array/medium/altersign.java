public class altersign {
    public static void main(String [] args)
    {
        int [] arr={1,2,-3,-1,-2,3};
        int n=arr.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int p=0,q=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                pos[p]=arr[i];
                p++;
            }
            else
            {
                neg[q]=arr[i];
                q++;
            }
        }
        p=0;
        q=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]=pos[p];
                p++;
            }
            else
            {
                arr[i]=neg[q];
                q++;
            }
        }
        for(int num: arr)
        {
            System.out.print(num + " ");
        }
    }
}
