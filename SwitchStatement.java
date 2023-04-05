import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        //Give indian cloths size and run class to switch UK size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Indian size number: ");
        int a = scanner.nextInt();

        int number = a;
        String size;
        switch (number) {
            case 29:
                size = "Small";
                break;
            case 42:
                size = "Medium";
                break;
            case 44:
                size = "Large";
                break;
            case 48:
                size = "Extra Large";
                break;
            default:
                size = "Unknown";
                break;
        }
        System.out.println("Uk cloths Size is: " + size);
    }
    // Print the UK cloths size
}
