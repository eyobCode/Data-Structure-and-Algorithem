import java.util.Arrays;

public class RemoveEvenNumber {
    public static int[] removeEven(int [] arr){
        int oddNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){

                oddNumber++;

            }
        }
        int[] result =  new int[oddNumber];
        int indx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 ){
                result[indx] = arr[i];
                indx++;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(removeEven(arr)));
    }

}
