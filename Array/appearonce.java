/* 

==============BRUTE FORCE====================

public class appearonce
{
    public static void main(String[] args)
    {
        int [] arr={5,6,7,7,6,3,5};
        int n=arr.length;
        int pos=-1;
        for(int i=0;i<n;i++)
        {
            int k=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    k++;
                    pos=i;
                }
            }
            if(k==2)
                k=0;
            else
            {
                System.out.println(arr[pos]);
                break;
            }
        }
    }
}

*/

/*

===============BETTER APPROACH===============
hash map for freq counting

import java.util.HashMap;
import java.util.Map;

public class appearonce {

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 7, 6, 3, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println("Element appearing once: " + entry.getKey());
                break;
            }
        }
    }
}

*/

// =========== OPTIMAL ===============
// when duplicates are present think of XOR

public class appearonce{

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 7, 6, 3, 5};

        int xor = 0;

        for (int num : arr) {
            xor ^= num;
        }

        System.out.println("Element appearing once: " + xor);
    }
}