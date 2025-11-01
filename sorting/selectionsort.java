package sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 5, 4};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_sort(int[] arr){
        for(int i=0; i< arr.length; i++){
            int last= arr.length - i -1;
            int maxindex = getmaxindex(arr, 0,  last);
            swap(arr, maxindex, last);
        }
    }
    private static int getmaxindex(int[] arr, int start, int end){
        int max = start;
        for(int i= start; i<= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
