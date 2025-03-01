package GradingQuestion;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks between (0-100)");
        int n = scanner.nextInt();

        String grade ="";
        int marks = n/10;

        switch(marks){

            case 10:
            case 9:
            grade = "A";
            break;

            case 8:
            grade = "B";
            break;

            case 7:
            grade = "C";
            break;

            case 6:
            grade = "D";
            break;

            default:
            grade = "Fail";
        }

        System.out.println("Your grade is "+ grade);
   
        
    }
}

