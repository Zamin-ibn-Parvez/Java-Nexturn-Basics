package Day4Concepts;
import java.util.*;

public class AtmVerification {
    public static void main(String[] args) {
    int attempts = 3;
    int atmPin= 1234;
    
    int i=0;

    while(i<attempts){
        System.out.println("Enter Your Pin");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        if(n == atmPin){
            System.out.println("You entered the correct password");
            break;
        }
        else{
            if(i<2){
                System.out.println("Incorrect password !! Try Again");
            }

            else{
                System.out.println("You have used all your attempts!! The account is blocked");
            }
        }
        i++;
  }
}
};

    
