import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i]; //started from 1 index
            int previous=i-1; //started from 0 index
            while (previous > -1 && arr[previous] > temp ){
                arr[previous + 1] =arr[previous];
                previous--;
            }
            arr[previous + 1] =temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,1,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));//Original array
        insertionSort(arr);
        System.out.println(Arrays.toString(arr)); //Sorted array
    }
}
