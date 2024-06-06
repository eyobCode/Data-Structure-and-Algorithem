import java.util.Arrays;


public class ReverseArray {
    public static int[] reverse(int[] arr){
        int[] reverseArray = new int[arr.length];
        int indx=0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            reverseArray[indx] = arr[i];
            indx++;
        }
        return reverseArray;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
