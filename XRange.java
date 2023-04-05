import java.util.Scanner;

public class XRange {
    public static void main (String[]args) {
        // want the total of any range till 20
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        int sum = 0;

        for (int i = a; i <= 20; i++)
            sum = sum + i;
        System.out.println ("The sum of x range is " + sum);
    }
    //Print the total of given range
}
