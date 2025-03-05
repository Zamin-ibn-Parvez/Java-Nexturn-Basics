package Day5.Recursion;

public class SumofDigitsUsingRecursion {
    public static int sumOfDigits(int n){
        if(n ==0){
            return 0;
        }

        return sumOfDigits(n/10) + n%10;
        
    }

    public static void main(String[] args) {
        int ans = sumOfDigits(678);
        System.out.println(ans); 
    }
}
