package PrintingLoopQuestion;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of interations you want");
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.println(i+" "+j);
            }
        }

    }
}
