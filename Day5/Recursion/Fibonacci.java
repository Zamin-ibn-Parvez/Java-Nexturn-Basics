package Day5.Recursion;
import java.util.*;

public class Fibonacci {

        public static int printFibonacci(int n) {
            if (n <= 1) {
                return n;
            }

            return printFibonacci(n-1)+printFibonacci(n-2);


        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of terms of Fibonacci sequence you want");
            int n = sc.nextInt(); // Number of terms in the Fibonacci series
            System.out.println("Fibonacci Series up to " + n + " terms:");
            
            for(int i=0;i<n;i++){
                System.out.print(printFibonacci(i) + " ");
            }
        }
}
    

