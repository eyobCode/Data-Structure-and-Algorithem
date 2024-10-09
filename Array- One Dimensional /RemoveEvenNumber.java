import java.util.Arrays;

public class RemoveEvenNumber {
    static int[] removeEven(int[] arr){
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++){
             if (arr[i] % 2 != 0){
                 oddCount ++;
             }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                result[idx] = arr[i];
                idx++;
            }

        }
        return result;
    }

    public static void printer(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arrays = {2,3,4,5,6,1,7,9};
        int[] newA = removeEven(arrays);

        printer(newA);

    }
}
