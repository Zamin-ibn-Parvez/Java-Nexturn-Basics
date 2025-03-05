package Day4Questions;

public class SumofArray {
    public static void main(String[] args) {
        int [] nums = {2,4,67,8,9,7};
        int sum=0;

        for(int num : nums){
            sum+=num;
        }
        System.out.println("The sum of the array is " +sum);
    }
    
    
}
