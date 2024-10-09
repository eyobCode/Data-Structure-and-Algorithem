import java.util.Arrays;


public class ReverseArray {
    public static void reveseArray(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public  static  void printer(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        printer(arr);
        reveseArray(arr, 0 , arr.length -1);
        printer(arr);
    }
}
