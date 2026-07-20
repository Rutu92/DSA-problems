/* 

==============BRUTE FORCE================

public class longconseseq {
    public static boolean linearSearch(int[] arr, int target)
    {
        for(int num : arr)
        {
            if(num == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        int n = arr.length;
        int longest = 1;

        for(int i = 0; i < n; i++)
        {
            int current = arr[i];
            int count = 1;
            while(linearSearch(arr, current + 1))
            {
                current++;
                count++;
            }
            if(count > longest)
            {
                longest = count;
            }
        }
        System.out.println(longest);
    }
}

*/

public class longconseseq
{
    public static void main(String [] args)
    {
        int [] arr={0,3,7,2,5,8,4,6,0,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int c=1;
        int max=1;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i] == arr[i+1])
                continue;
            else if(arr[i] + 1 == arr[i+1])
                c++;
            else
            {
                max = Math.max(max, c);
                c = 1;
            }
        }
        max = Math.max(max, c); // if longest seq ends at last element we need to check for max again
        System.out.println(max);

    }
}