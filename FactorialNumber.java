import java.util.Scanner;

public class FactorialNumber {
    public static void main(String []args) {
        //Enter the number which you want
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        int a=1;
        for(int i=1;i<=num;i++)
        {
            a=a*i;
        }
        System.out.println(a+" is a factorial number of "+num);
    }
    //Print the factorial total of given number
}
