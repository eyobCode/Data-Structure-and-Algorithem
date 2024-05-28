public class MaxValue {
    public static void maxmimu(int[] arr) {

        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxi < arr[i]) {
                maxi = arr[i];
            }
        }
        System.out.println(maxi);
    }


}
