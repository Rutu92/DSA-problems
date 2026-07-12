/*import java.util.*;

============== MY METHOD ========================

public class conseOnes 
{
    public static void main(String[] args)
    {
        int [] arr={0,1,1,0,1,0,0,1,1,1,1,0};
        int n=arr.length;
        int k=0; 
        ArrayList<Integer> temp= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
                k++;
            else
            {
                temp.add(k);
                k=0;
            }
        }
        int max = Collections.max(temp); 
        System.out.println(max);
    }
}

*/

public class conseOnes {

    public static void main(String[] args) {

        int[] arr = {0,1,1,0,1,0,0,1,1,1,1,0};

        int count = 0;
        int max = 0;

        for(int num : arr)
        {
            if(num == 1)
            {
                count++;
                max = Math.max(max, count);
            }
            else
            {
                count = 0;
            }
        }

        System.out.println(max);
    }
}
