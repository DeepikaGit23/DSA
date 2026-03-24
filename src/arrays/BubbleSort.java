package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64,34,19,5,90,7,3};
        bubble(arr);
    }

    public static void bubble(int[] arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            int temp;
            for(int j = 0; j < arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
