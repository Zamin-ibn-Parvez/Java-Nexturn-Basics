package Day3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferREader {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter A name: ");
         String name = br.readLine();

         System.out.println("Hello "+name);

    }
}
