public class mergeSort {
    public static void Sort(int[] arr,int[] temp,int low,int high){
        if(low < high){
            int mid=low+(high - low)/2;
            Sort(arr,temp,low,mid);
            Sort(arr,temp,mid + 1,high);
            merge(arr,temp,low,mid,high);
        }
    }
}
