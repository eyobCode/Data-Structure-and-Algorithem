import java.util.Arrays;

public class DeleteFromArray {
    public static int[] deletefromArray(int[] arr,int index){

        if(index < 0 || arr.length < index){
            System.out.println("Invalid index.");
            return arr;
        }
        int[] newArray= new int[arr.length -1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (index != i){
                newArray[j++] = arr[i];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int indexToDelete = 2; // example index
        System.out.println("Original array: " + Arrays.toString(array));

        
        array = deletefromArray(array, indexToDelete);

        System.out.println("Array after deletion: " + Arrays.toString(array));
    }
}
