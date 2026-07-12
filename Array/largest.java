import java.util.Arrays;

public class largest {
    public static void main(String []args)
    {
        int [] arr={2,7,5,4,8,4};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println("Largest element: "+ arr[n-1]);
    }
    
}
