public class LinearSearch {
    public static int Linearsearch(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,6,7,8,4};
        System.out.println(Linearsearch(arr,6));
    }
}
