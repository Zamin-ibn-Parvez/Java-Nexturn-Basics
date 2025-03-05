package Day5.Recursion;

public class ReverseString {

    public static String ReverseString (String str){
        if(str.isEmpty())
            return str;
        else
            return ReverseString(str.substring(1)) + str.charAt(0);
    }


    public static void main(String[] args) {
        String str = "Hello";
        String reversedString = ReverseString(str);

        System.out.println(reversedString);
    }
}


