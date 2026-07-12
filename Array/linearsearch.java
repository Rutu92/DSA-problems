public class linearsearch {
    public static void main(String[] args)
    {
        int [] arr={2,5,4,3,5,7};
        int sea=9;
        int pos=-1;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(sea==arr[i])
            {
                pos=i;
                break;
            }
        }
        if(pos==-1)
        {
            System.out.println("not found");
        }
        else{
            System.out.println("found at pos: "+ pos);
        }
    }
}
