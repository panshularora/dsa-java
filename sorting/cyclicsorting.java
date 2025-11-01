package sorting;

import java.util.Arrays;

public class cyclicsorting {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 1};
        cyclic_sorting(arr);
        System.err.println(Arrays.toString(arr));
    }
    static void cyclic_sorting(int[] arr){
    int i=0;
    while(i < arr.length){
        int correctindex = arr[i] - 1;
        if(arr[i] != arr[correctindex]){
            swap(arr, i, correctindex);
        } else{
            i++;
        }
    }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
