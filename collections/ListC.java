package collections;

import java.util.ArrayList;
import java.util.List;


public class ListC {
    public static void main(String[] args) {
        

        //orderd list
        //indexing 
        // directly print values 

        List<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(5);
        arr.add(2);
        arr.add(8);
        arr.add(3);

        System.out.println(arr.get(3));
        System.out.println(arr.size());
        System.out.println(arr);


    }
}
