/*
============BRUTEE FORCE==============

public class pairsum {
    public static void main(String [] args)
    {
        int sum=0;
        int k,l =0;
        int [] arr={2,6,5,8,11};
        int target=14;
        int n=arr.length;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1;j<n;j++)
            {
                    sum= arr[i]+arr[j];
                    if(sum==target)
                    {
                        System.out.println(i+" "+j);
                        break;
                    }
                    sum=0;
            }
            
        }

    }
}

*/

import java.util.*;

public class pairsum
{
    public static void main(String [] args)
    {
        int [] arr={2,6,5,8,11};
        int target=14;
        int n=arr.length;
        boolean found = false;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int need=target-arr[i];
            if(map.containsKey(need))
            {
                System.out.println(map.get(need)+" "+i);
                break;
            }
            map.put(arr[i],i);
        }
        if(!found)
        {
            System.out.println("-1 -1");
        }
    }
}
