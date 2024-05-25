import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static String[] GenerateBinary(int number){
        String[] result = new String[number];
        Queue<String> temp = new LinkedList<>();

        temp.offer("1");

        for (int i = 0; i < number; i++) {
            result[i] = temp.poll();

            String n1 = result[i] + "0";
            String n2 = result[i] + "1";

            temp.offer(n1);
            temp.offer(n2);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(GenerateBinary(9)));
    }
}
