public class BubbleSortInString {
    public static String bubbleSort(String s){
        char[] chars = s.toCharArray();
        for (int i = chars.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (chars[j] > chars[j+1]){
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String arr=("ASCII");
        System.out.println(bubbleSort(arr));
//        4. Implement the bubble sort algorithm to sort an array of alphabets (ASCII).
//           [5 points]

    }
}
