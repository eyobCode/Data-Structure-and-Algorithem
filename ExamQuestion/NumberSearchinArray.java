import java.util.Scanner;

public class NumberSearchinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array :");
        int length=scanner.nextInt();

        int[] array = new int[length];
        System.out.println("Enter " + length + " numbers:");

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int searchNumber = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber){
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Number " + searchNumber + " is present in the array " + count + " times.");
        } else {
            System.out.println("Number " + searchNumber + " is not present in the array.");
        }
    }
}
