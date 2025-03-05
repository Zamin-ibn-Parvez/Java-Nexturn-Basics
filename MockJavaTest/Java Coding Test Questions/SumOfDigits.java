import java.util.*;


public class SumOfDigits{

    public static int sumofdigits(int num){

        //base case
        if(num ==0)
            return 0;

        return num%10 + sumofdigits(num/10);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int ans = sumofdigits(n);
        System.out.println("The sum of the digits : "+ans);

    }
}