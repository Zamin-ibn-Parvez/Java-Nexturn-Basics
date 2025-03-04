package Day4Questions;
import java.util.*;

public class CheckIfArraysAreEqual {

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,5};
    
        if(Arrays.equals(arr1 , arr2)){
            System.out.println("The arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }

}
