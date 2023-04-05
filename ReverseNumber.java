import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int m, n, reversed = 0;
        // Give the range of expected number
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        m = s.nextInt();
        for (; m != 0; m /= 10) {
            n = m % 10;
            reversed = reversed * 10 + n;
        }
        System.out.println("Reversed number: " + reversed);
    }
    // Print the number in reverse
}
