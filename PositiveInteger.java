import java.util.Scanner;

public class PositiveInteger {
    public static void main(String[] args) {
        // Enter the positive integer by user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;

        }
        System.out.println("The sum of the series is " + sum);
    }
    //Print the positive integer answer as per given number
}
