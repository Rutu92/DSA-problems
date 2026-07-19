import java.util.*;

public class majority {
    public static void main(String [] args)
    {
        int [] arr={7,7,7,4,3,5,3,3,7,7,7,7,7,7};
        int n=arr.length;
        HashMap <Integer,Integer> map=new HashMap<>();

        for(int num :arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        int maxFreq = 0;
        int majority = -1;

        for(HashMap.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > maxFreq)
            {
                maxFreq = entry.getValue();
                majority = entry.getKey();
            }
        }

        if(maxFreq > n/2)
            System.out.println(majority);
        else
            System.out.println("No Majority Element");
    }
}
