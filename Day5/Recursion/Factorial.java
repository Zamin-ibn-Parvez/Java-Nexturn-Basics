package Day5.Recursion;
import java.util.*;

public class Factorial {

    //Recursion is a process of the function calling itself;
    //base case : It is the stopping condition to stop the recursive call and return the value;
    //In the recursive call the function calls itself with modified parameters;

    //syntax: return type functionName (parameters){
        //if(baseCase){
        // return result;
        //}
        // return methodName(modified parameters)
    
    public int factorial ( int num){
        //base case
        if(num ==1 || num ==0){
            return 1;
        }
        
        return num* factorial(num-1);
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = fact.factorial(n);

        System.out.println("The factorial of "+n + " is :" + ans);


    }


//}
}

