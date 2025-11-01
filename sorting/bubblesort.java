 package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
         System.out.print("The sorted array is: ");
         for(int num : arr){
            System.out.print(num + " ");
        }
    }
    static void bubble_sort(int[] arr){
        // run the steps n-1 times
        for(int i=0; i<arr.length; i++){
            // for each step max item will come at last respective index
            for(int j=1; j<arr.length-i; j++){
                // swap if the item is smaller than previous item
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
