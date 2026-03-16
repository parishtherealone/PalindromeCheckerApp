import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class QueueStackPalindrome {
    public static void main(String[] args) {
        String word = "madam";

        Queue<Character> queue = new LinkedList<>(); // FIFO
        Stack<Character> stack = new Stack<>();       // LIFO

        // 1. Enqueue & Push characters
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // 2. Logical Comparison: Compare dequeue vs pop
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Print Result
        if (isPalindrome) {
            System.out.println("It's a Palindrome! 🚀 (FIFO matches LIFO)");
        } else {
            System.out.println("Not a Palindrome. ❌");
        }
    }
}