import java.util.Arrays;

public class BubbleSortTwo {
    public static void bubblesorttwo(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length -1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped == false)break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(arr));
        bubblesorttwo(arr);
        System.out.println(Arrays.toString(arr));
    }
}
