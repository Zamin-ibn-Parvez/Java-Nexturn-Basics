package Day4Questions;

public class FindLargestInArray {
    public static void main(String[] args) {
        int [] nums = {2,4,67,8,9,7};
        int max = 0;
    
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Largest number in the array is: " + max);
    }


}
