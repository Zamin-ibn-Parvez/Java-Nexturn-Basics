package ActivityQuestion;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter activity name: ");
        String activity = scanner.nextLine();
        
        System.out.println("Enter duration in minutes: ");
        double duration = scanner.nextDouble();
        
        scanner.close();
        
        double caloriesPerMinute = 0;
        
        // Using simple if-else statements
        if (activity.equalsIgnoreCase("Running")) {
            caloriesPerMinute = 10.0;
        } else if (activity.equalsIgnoreCase("Cycling")) {
            caloriesPerMinute = 8.5;
        } else if (activity.equalsIgnoreCase("Swimming")) {
            caloriesPerMinute = 9.0;
        } else if (activity.equalsIgnoreCase("Walking")) {
            caloriesPerMinute = 4.0;
        } else if (activity.equalsIgnoreCase("Jumping Rope")) {
            caloriesPerMinute = 12.0;
        } else if (activity.equalsIgnoreCase("Yoga")) {
            caloriesPerMinute = 3.5;
        } else if (activity.equalsIgnoreCase("Weightlifting")) {
            caloriesPerMinute = 6.0;
        } else {
            System.out.println("Activity not found. Please enter a valid activity.");
            return;
        }
        
        double caloriesBurned = caloriesPerMinute * duration;
        System.out.println("Calories Burned: " + caloriesBurned);
    }
   
        
    }



