package arrays;

public class FindLowest {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 4, 1, 6, 7, 3, 9};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr) {
        int low = arr[0];
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] < low)
            {
                low = arr[i + 1];
            }
        }
        return low;
    }
}
