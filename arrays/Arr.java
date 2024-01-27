package arrays;

public class Arr {
    
    public static void main(String[] args) {
        

        int arr[][] = new int[3][];
        //jagged array 

        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3]; // arr[i] - no of rows 


        for(int x[] : arr){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
