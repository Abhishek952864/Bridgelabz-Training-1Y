class PalindromeChecker {
    String text;

    boolean checkPalindrome() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }
        return text.equals(rev);
    }

    void display() {
        if (checkPalindrome())
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();

        p.text = "madam";

        p.display();
    }
}