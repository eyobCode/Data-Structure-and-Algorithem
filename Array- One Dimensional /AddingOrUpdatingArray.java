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
    public void arrayDemo() {

        // Declaration and Initialization

        int[] array = new int[4];
        printArray(array); //[0,0,0,0,0,0,0]

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;

        printArray(array); //1,2,3,4

        System.out.println(array[array.length-1]); // last element 4

        int[] arr2 = {4,3,2,1};
        printArray(arr2);


    }

    public static void main(String[] args) {
        AddingOrUpdatingArray aa = new AddingOrUpdatingArray();

        aa.arrayDemo();
    }









}
