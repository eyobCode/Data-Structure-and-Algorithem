public class merge {
    public static void Sort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            Sort(arr, temp, low, mid);
            Sort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        // Copy array from arr to temp
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }
    public static void print(int[] arr){
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static int[] tunnel(int[] t){
        int[] temp = new int[t.length];
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,6};
        int[] temp=tunnel(arr);
        Sort(arr, temp, 0, arr.length - 1); // Corrected high parameter
        print(arr);

    }
}

