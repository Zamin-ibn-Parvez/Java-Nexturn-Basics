package Day4Concepts;

public class arrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};   //single dimensional array

        //for each loop
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();


//     int i =0;
//     while loop 
//     while(i<arr.length){
//         System.out.print(arr[i]+" ");
//         i++;
//     }

    //do_while loop 
    // do{
        
    //     System.out.print(arr[i]+" ");
    //     i++;
    // }while(i<arr.length);

        //Multi_Dimensional Arrays

        //jagged Arrays
        int [][] jagged = new int[4][];
        jagged[0] = new int[]{0};
        jagged[1] = new int []{1,2};
        jagged[2] = new int[] {3,4,5};
        jagged[3] = new int []{6,7,8,9};

        for(int i=0;i<jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                System.out.print(jagged[i][j]+" ");
            }
            System.out.println();
        }

    }




}
