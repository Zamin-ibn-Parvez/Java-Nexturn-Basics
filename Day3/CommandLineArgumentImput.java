package Day3;
public class CommandLineArgumentImput {
    public static void main(String[] args) {
        // Get the command line arguments
        if(args.length<2)
        {
            System.out.println("enter provide your name and age in command-line arguments.");
                return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println("Name: "+name + "\nAge: "+age);
        
    }
    
}
