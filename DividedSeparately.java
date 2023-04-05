import java.util.Scanner;

public class DividedSeparately {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //Want numbers between from 1 to 100 which is divided by 3
        System.out.println("Enter 3 number: ");
        int a = scanner.nextInt();
        //Want numbers between from 1 to 100 which is divided by 5
        System.out.println("Enter 5 number: ");
        int z = scanner.nextInt();
        System.out.println("\nDivided by 3: ");
        for (int i=1; i<100; i++) {
            if (i%a==0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i=1; i<100; i++) {
            if (i%z==0) System.out.print(i +", ");
        }
    }
    //Print numbers separately as divided by 3 and 5
}
