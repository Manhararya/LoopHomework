import java.util.Scanner;

public class InputRange {
    public static void main(String[] args) {
        // Run this class and give any range of number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start number: ");
        int a = scanner.nextInt();
        System.out.println("Enter end number: ");
        int z = scanner.nextInt();
        System.out.println("Numbers of given range are as below:");

        for (a = a; a <= z; a++) {
            System.out.println(a);
        }
        // Print numbers between given range
    }
}

