package PrintingFibonacciSeries;

import java.util.*;



public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(FibonacciUsingRecursion(i) + " ");
        }

    }

    public static int  FibonacciUsingRecursion(int n){

        //base case 
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

    return FibonacciUsingRecursion(n-1) + FibonacciUsingRecursion(n-2);
    }
}
