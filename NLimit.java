import java.util.Scanner;

public class NLimit {

    public static void main(String[] args) {
        int i, n, sum=0;
        {
            //Display n limit of natural number with sum
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter n number: ");
            n = scanner.nextInt();
        }
        System.out.println("The first n natural numbers are: "+n);
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("The Sum of Natural Number upto "+n+ " is: " +sum);
    }
    //Print given number range with total
}
