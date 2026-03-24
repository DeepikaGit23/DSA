package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64,7,8,34,22,11,45};
        selection(arr);
    }

    public static void selection(int[] arr) {

        for(int i = 0; i < arr.length-1; i++)
        {
            int minIdx = i;

            for(int j = i+1; j<arr.length-1; j++)
            {
                if(arr[minIdx] > arr[j])
                {
                    minIdx = j;
                }
            }
            int minVal = arr[minIdx];

            for(int k = minIdx; k > i; k--)
            {
                arr[k] = arr[k-1];
            }

            arr[i] = minVal;
        }
        System.out.println(Arrays.toString(arr));
    }
}
