/*
========BRUTE FORCE============

public class longestsubarraysum 
{
    public static void main(String[] args) 
    {
        int[] arr = {10,5,2,7,1,9};
        int k = 15;
        int maxLength = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            for(int j = i; j < arr.length; j++)
            {
                sum += arr[j];
                if(sum == k)
                {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        System.out.println(maxLength);
    }
}

*/

import java.util.HashMap;

public class longestsubarraysum {

    public static void main(String[] args) {

        int[] arr = {10,5,2,7,1,9};

        int k = 15;

        HashMap<Integer,Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        for(int i = 0; i < arr.length; i++)
        {
            prefixSum += arr[i];

            if(prefixSum == k)
            {
                maxLength = i + 1;
            }

            if(map.containsKey(prefixSum - k))
            {
                int length = i - map.get(prefixSum - k);
                maxLength = Math.max(maxLength, length);
            }

            if(!map.containsKey(prefixSum))
            {
                map.put(prefixSum, i);
            }
        }

        System.out.println(maxLength);
    }
}