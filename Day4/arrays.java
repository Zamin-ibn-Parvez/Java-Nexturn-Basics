package Day4;

public class arrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};

        //for each loop
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();

    int i = 0;
//while loop 
    while(i<arr.length){
        System.out.print(arr[i]+" ");
        i++;
    }

    System.out.println();

    //do_while loop 
    do{
        System.out.print(arr[i]+" ");
        i++;
    }while(i<arr.length);

    }
}
