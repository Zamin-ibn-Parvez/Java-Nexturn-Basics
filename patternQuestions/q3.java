package patternQuestions;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i);
            for(int j=1;j<=n+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
