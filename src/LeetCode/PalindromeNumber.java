package LeetCode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        String convertToString = Integer.toString(x);
        String reversedString = new StringBuilder(convertToString).reverse().toString();

        return convertToString.equals(reversedString);
    }
}
