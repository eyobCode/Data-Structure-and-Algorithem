import java.util.Arrays;

public class moveZeroesToEnd {
    public int[] moveZero(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }if (arr[j] != 0){
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr ={0,1,2,3,0,4};
        moveZeroesToEnd mz = new moveZeroesToEnd();
        System.out.println(Arrays.toString(mz.moveZero(arr)));
    }
}
