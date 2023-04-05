import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int minNumber = 0;
        int previousNumber = 0;
        int nextNumber = 1;
        //How many fibonacci numbers do you want input that
        System.out.println("Enter fibonacci number:");

        Scanner scanner = new Scanner(System.in);
        minNumber = scanner.nextInt();

        System.out.println("First "+minNumber+" fibonacci numbers as below");

        for (int i = 1; i <= minNumber; ++i) {
            System.out.println(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        // Print number between given fibonacci Series
    }
}


