import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] myArray={9,8,7,6,5,4,3,2,1};
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
