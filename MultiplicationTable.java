import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Enter the number, which number's table you want
        Scanner scanner = new Scanner(System.in);
        System.out.print("Table number: ");

        int a =scanner.nextInt();
        System.out.println("Table number "+a+" as below");
        for(int i=1; i <= 12; i++)
        {
            System.out.println(a +" * "+ i +" = "+ a * i);
        }
    }
    //Print the table of given number's
}
