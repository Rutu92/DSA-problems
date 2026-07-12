public class removedupli {

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 4, 4, 4, 6, 7, 7, 8};
        int k = removeDuplicates(arr);
        System.out.println("Number of unique elements = " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {

        if (arr.length == 0)
            return 0;
        int i = 0;

        for (int j = 1; j < arr.length; j++) 
        {
            if (arr[j] != arr[i]) 
            {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}