class PalindromeCheckerApp {
    public static void main(String[] args) {

        String word = "madam";   // hardcoded string
        String reversed = "";

        // reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // check palindrome
        if (word.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}