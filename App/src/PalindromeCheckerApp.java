import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Reverse String
    static boolean reverseMethod(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return str.equals(rev);
    }


    // Method 2: Stack
    static boolean stackMethod(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }


    // Method 3: Deque
    static boolean dequeMethod(String str) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        long start, end;


        // Reverse method time
        start = System.nanoTime();
        reverseMethod(str);
        end = System.nanoTime();
        System.out.println("Reverse Method Time: " + (end - start));


        // Stack method time
        start = System.nanoTime();
        stackMethod(str);
        end = System.nanoTime();
        System.out.println("Stack Method Time: " + (end - start));


        // Deque method time
        start = System.nanoTime();
        dequeMethod(str);
        end = System.nanoTime();
        System.out.println("Deque Method Time: " + (end - start));

        sc.close();
    }
}