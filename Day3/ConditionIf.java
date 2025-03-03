package Day3;
import java.util.Scanner;

public class ConditionIf {
    public static void main(String[] args) {
        //Condition

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        
        if(x%9==0)
        {
            System.out.println("Divisible By 9");
        }else{
            System.out.println("Not Divisible BY 9");
        }
    }
}
