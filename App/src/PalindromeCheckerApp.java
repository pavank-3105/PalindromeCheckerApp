import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        // Normalize string
        str = str.toLowerCase();

        // Remove spaces using regex
        str = str.replaceAll("\\s+", "");

        boolean palindrome = true;

        int start = 0;
        int end = str.length() - 1;

        // Compare start & end
        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                palindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Result
        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}