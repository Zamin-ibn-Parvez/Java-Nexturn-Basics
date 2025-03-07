package Day4Questions;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();


        if(isPalindrome(str)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }

    }

    public static boolean isPalindrome(String str){
        int i=0 , j = str.length()-1;

        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            } 
            else{
                return false;
            }
        }

        return true;

    }
}

