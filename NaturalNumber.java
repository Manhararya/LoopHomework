import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        //Enter range number, which range do you want total
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int i,sum=0;

        for(i=0;i<=n;i++)
        {
            sum = sum + i;
        }

        System.out.println("Sum of first "+n+" natural nos = "+sum);
    }
    // Print the total of range
}
