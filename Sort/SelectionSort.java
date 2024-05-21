import java.util.Arrays;

public class SelectionSort {
    public static void SelectionSort(int[] arrays){
        for (int i = 0; i < arrays.length-1; i++) {
            int index=i;
            for (int j=i+1; j < arrays.length; j++){
                if (arrays[j] < arrays[index]){
                    index=j;
                }
            }
            if (i != index){
                int temp=arrays[index];
                arrays[index]=arrays[i];
                arrays[i]=temp;
            }

        }
    }

    public static void main(String[] args) {
        int[] myArray={9,8,7,6,5,4,3,2,1};
        SelectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
