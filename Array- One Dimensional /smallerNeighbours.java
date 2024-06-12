public class smallerNeighbours {
    public int smallerNeighbours(int[] arr){
        int count = 1;
        int index = 0;
        int[] newArr={};
        for (int i = 0; i < arr.length; i++) {
            if (arr[count] > arr[i] && arr[count] > arr[count + 1]){
                newArr[index] = arr[count];
                count++;
                index++;
            }
        }
        return 2;
    }

    public static void main(String[] args) {

    }
}
