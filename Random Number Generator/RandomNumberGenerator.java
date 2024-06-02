import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        LCG lcg = new LCG();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound for the random number: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound for the random number: ");
        int upperBound = scanner.nextInt();

        if (lowerBound > upperBound) {
            System.out.println("Error: The lower bound must be less than or equal to the upper bound.");
        } else {
            int range = upperBound - lowerBound + 1;
            int randomNumber = lcg.nextInt(range) + lowerBound;

            System.out.println("Generated random number: " + randomNumber);
        }
    }
}