
package Day5;

import java.util.*;

public class creatingFunction {

    public static boolean max(int a , int b){
        if(a>b){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

       boolean ans =  max(a,b);

        if(ans){
            System.out.println(a +" is greater than " + b);
        }
        else{
            System.out.println(b +" is greater than " + a);
        }
    }
}
