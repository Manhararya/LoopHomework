import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        //Run this class and write any String and count total number of in that string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string here");
        String hello = scanner.nextLine();
        int charCount = hello.length() - hello.replaceAll("a", "").length();
        System.out.println("Total number of 'a' is");
        System.out.println(charCount);
    }
    // Print total number of 'a' in string
}
