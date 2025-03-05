import java.util.*;

public class checkPalindrome {

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;

        while(i<=j){
            if(str.charAt(i) == str.charAt(j) ) {
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be checked :");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("Yes , This string is a palindrome");
        }
        else{
            System.out.println("No , This string is not a palindrome");
        }
    }

}
