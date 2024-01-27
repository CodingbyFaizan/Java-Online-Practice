package arrays;


public class ArrExample{
    public static void main(String[] args) {
        
        // int arr[] = new int[4];

        // for(int i=0; i<arr.length; i++){
        //     arr[i] = (int) ( Math.random() * 10 );
        // }

        // for(int x : arr){
        //     System.out.println(x);
        // }


        // jagged array
        int arr[][] = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[2];

        // for(int x[] : arr){
        //     for(int y : x){
        //         System.out.print(y + " ");
        //     }
        //     System.out.println();
        // }

        System.out.println(arr.length);

        // arr[0].length ----------
        // arr[1] ----------
        // arr[2] ----------


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = (int) (Math.random() * 10 );
            }
        }

        for(int x[] : arr){
            for(int y : x){
                System.out.print(y);
            }
            System.out.println();
        }




    }
}