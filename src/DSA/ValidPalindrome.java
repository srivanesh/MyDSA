package DSA;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        //String s = "aBba";
        System.out.println("Result ::"+isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        boolean ispalindrome = false;
        s = s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder str1 = new StringBuilder(s);

        if (s.equalsIgnoreCase(str1.reverse().toString())) {
            ispalindrome = true;
        } else {
            ispalindrome = false;
        }
        return ispalindrome;
    }
}
