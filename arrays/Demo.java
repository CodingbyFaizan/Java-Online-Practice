package arrays;

// import java.lang.Math;

public class Demo {
    public static void main(String[] args) {        
        // fixed size
        // continuous 
        // same type 
        
        // int arr[] = { 1,2 3, 4,5 };

        // int a[] = { 1, 2, 3 , 4};
        int b[][] = new int[4][4];

        for(int i = 0; i<=3; i++){
            for(int j=0; j<4; j++){
                b[i][j] = (int) ( Math.random() * 10 ); 
            } 
        }

        // for(int i=0;i<4;i++){
        //     System.out.println(b[i]);
        // }


        for(int x[] : b){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
        

        //
        // int arr[][] = new int[2][] ;
        
        // arr[0] = new int[3];
        // arr[1] = new int[2];
        
        // // System.out.println(arr[1].length);
        
        // for(int i=0; i<2; i++) // 
        // {
        //     for(int j=0; j<arr[i].length; j++){
        //         arr[i][j] = (int) ( Math.random() * 10 ); 
        //     }
        // }
        
        // for(int x[] : arr )
        // {
        //     for(int y : x)
        //     {
        //         System.out.print(y + " ");
        //     }
        //     System.out.println();
        // }
        
        
        // for( int x[] : arr){
        //     for(int y : x){
        //         System.out.println(x);
        //     }
        // }
        
        
        
        // int a[] = new int[4];
        
        // System.out.println(arr.length);
        
        // for(int i=1 ; i <= arr.length; i++){
        //     arr[i] = 10;
        // }
        
        
        // enhanced for loop
        // for(int x : arr){
        //     System.out.println( x );
        // }
        
        
        
    
    }
}
