import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LCG random = new LCG();
        System.out.println(random.nextDouble());
        System.out.println(Arrays.toString(random.nextSequence(10, 5)));
    }
}