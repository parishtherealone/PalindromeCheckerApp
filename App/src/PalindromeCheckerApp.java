class RecursionPalindrome {
    public static void main(String[] args) {
        String word = "kayak";

        // Initial call: start from index 0 and length-1
        if (check(word, 0, word.length() - 1)) {
            System.out.println(word + " is a Palindrome! 🔄");
        } else {
            System.out.println(word + " is not a Palindrome. ❌");
        }
    }

    public static boolean check(String s, int start, int end) {
        // 1. Base Condition: Agar pointers ek dusre ko cross kar gaye
        if (start >= end) {
            return true;
        }

        // 2. Recursive Call & Comparison
        // Pehle current characters check karo
        if (s.charAt(start) == s.charAt(end)) {
            // Agar match hua, toh andar waale characters ke liye firse call karo
            return check(s, start + 1, end - 1);
        }

        // Agar mismatch hua, toh seedha false
        return false;
    }
}