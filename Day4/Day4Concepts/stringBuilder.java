package Day4Concepts;
import java.lang.*;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Zamin");
        name.append(" Welcome");
        System.out.println(name);

        StringBuffer name1 = new StringBuffer("Hello");
        name1.append(" Zamin");
        System.out.println(name1);

        //String buffer is slower than String Builder
        //But String buffer is thread safe

        name.insert(0, "Greetings ");

        System.out.println(name);

        name1.replace(0 , 5 , "Assalamualaikum");  //Replaces a substring in a string within the given range of the indices

        System.out.println(name1.length() );//prints the length of the string 

        System.out.println(name1);
        name.reverse(); //Reverses the string 

        System.out.println(name1.charAt(0));
        System.out.println(name);
     
    }
}
