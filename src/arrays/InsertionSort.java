package arrays;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={65,78,45,22,43,12,6,89};
        insertion(arr);
    }

    public static void insertion(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int j = i-1;
            int currentVal = arr[i];
            int currentIdx = i;
            while (j >= 0 && arr[j] > currentVal) {
                arr[j+1] = arr[j];
                currentIdx = j;
                j--;
            }
            arr[currentIdx] = currentVal;
        }
        System.out.println(Arrays.toString(arr));
    }
}
