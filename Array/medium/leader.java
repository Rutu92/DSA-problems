import java.util.ArrayList;

public class leader {
    public static void main(String[] args)
    {
        int [] arr= {10,22,12,3,0,6};
        int n=arr.length;
        int m=arr[n-1];
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(m);

        for(int i=(n-2);i>=0;i--)
        {
            if(arr[i]>m)
            {
                temp.add(arr[i]);
                m=arr[i];
            }
        }
        for(int j=temp.size()-1;j>=0;j--)
        {
            System.out.print(temp.get(j)+ " ");
        }
    }
}
