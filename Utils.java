public class Utils {
    // Function to add x in arr
    public static int[] pushToIntArr(int arr[], int x)
    {
        int i;
        int n = arr.length;

        int newarr[] = new int[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
  
        newarr[n] = x;
  
        return newarr;
    }
}