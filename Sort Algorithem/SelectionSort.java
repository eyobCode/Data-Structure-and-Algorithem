import java.util.Arrays;

public class SelectionSort {
    public static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex=i;
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] myArray={9,8,7,6,5,4,3,2,1};
        SelectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
