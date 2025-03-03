package Day3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderAllDataType {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter an integer: ");
            int num = Integer.parseInt(br.readLine());

            System.out.print("Enter a decimal number: ");
            double val = Double.parseDouble(br.readLine());

            System.out.print("Enter a character: ");
            char ch = br.readLine().charAt(0);

            System.out.print("Enter true or false: ");
            boolean flag = Boolean.parseBoolean(br.readLine());

            System.out.println("\nYou entered:");
            System.out.println("Integer: " + num);
            System.out.println("Double: " + val);
            System.out.println("Character: " + ch);
            System.out.println("Boolean: " + flag);

            br.close(); 
    }
}
