import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int a;
        boolean Prime = true;
        int number;
        // Enter the number, which number do you want to check
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scanner.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            a = num % i;
            if (a==0){
                Prime = false;
                break;
            }
        }
        if (Prime)
            System.out.println(num+" is a prime number ");
        else
            System.out.println(num+" is not a Prime number");
    }
    // Print the given number with result
}
