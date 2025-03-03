package Day3;
import java.util.Scanner;

public class ScannerEx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        // System.out.println("Enter one word:");
        // String name2 = sc.next();
        // System.out.println(name2);

        System.out.println("Enter Interger:");
        int num = sc.nextInt();

        System.out.println("Enter Double:");
        double num2 = sc.nextDouble();

        System.out.println("Enter Boolean:");
        boolean bool = sc.nextBoolean();

        System.out.println("Enter Char:");
        char c = sc.next().charAt(0);

        System.out.println("Enter Float:");
        float num3 = sc.nextFloat();

        System.out.println("Enter Long:");
        long num4 = sc.nextLong();

        System.out.println(name);
        // System.out.println(name2);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(bool);
        System.out.println(c);
        System.out.println(num3);
        System.out.println(num4);

    }
}