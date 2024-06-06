public class findSecondMaxValue {
    public int findeSecondMaximumValue(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE; // -2147483648 its compare with min value integer

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if (secondMax < arr[i] && max != arr[i]) {
                secondMax = arr[i];
            }

        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-4,3,-2,-3,-5};
        findSecondMaxValue fsm = new findSecondMaxValue();
        System.out.println(fsm.findeSecondMaximumValue(arr));
    }
}
