import java.util.Scanner;

public class TemperatureCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature in Celsius: ");
        double temperature = scanner.nextDouble();
        
        if (temperature > 30) {
            System.out.println("The weather is Hot.");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("The weather is Warm.");
        } else if (temperature >= 10 && temperature < 19.9) {
            System.out.println("The weather is Moderate.");
        } else {
            System.out.println("The weather is Cold.");
        }
        
        scanner.close();
    }
}
