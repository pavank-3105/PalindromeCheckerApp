import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase
        str = str.toLowerCase();

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            queue.add(ch);   // Enqueue
            stack.push(ch);  // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {

            char qChar = queue.remove(); // Dequeue
            char sChar = stack.pop();    // Pop

            if (qChar != sChar) {
                isPalindrome = false;
                break;
            }
        }

        // Result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}