public class binarySearch {
    public static int binarySearch(int[] numbers, int target){
        int low = 0;
        int high=numbers.length-1;
        while (low <= high){
            int mid = (low + high)/2;
            if (numbers[mid] == target)
                return mid;
            if (numbers[mid] > target){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers={1,3,5,7,8,9,11,13,16,18,20};
        System.out.println(binarySearch(numbers,18));
    }
}
