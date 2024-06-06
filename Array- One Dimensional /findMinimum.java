public class findMinimum {
    public int minimum(int[] arr){

        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid input!");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {6,5,4,9,2,1,7};
        findMinimum ma = new findMinimum();
        System.out.println(ma.minimum(arr));
    }
}
