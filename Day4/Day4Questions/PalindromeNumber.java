package Day4Questions;
import java.util.*;



public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome number.");
            } 
        else {
            System.out.println(n + " is not a palindrome number.");
        }
    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
            }
            return n == rev;
    }

}
