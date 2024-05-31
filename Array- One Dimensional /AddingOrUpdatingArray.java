public class AddingOrUpdatingArray {
    // dataType[] arrayName = new dataType[size];
    // dataType arrayName[] = new dataType[size];

    // dataType[] arrayName = {element,element};

    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void arrayDemo(){

        // Declaration and Initialization

        int[] array = new int[7];  //[0,0,0,0,0,0,0]
        printArray(array);

    }

    public static void main(String[] args) {
        AddingOrUpdatingArray aa = new AddingOrUpdatingArray();

        aa.arrayDemo();
    }









}
