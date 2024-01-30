package collections;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class MapC {
    public static void main(String[] args) {
        

        // Faizan - 100

        Map<String,Integer> students = new HashMap<>();

        students.put("Faizan" , 22 );
        students.put("Ritesh" , 22 );
        students.put("Deepak" , 28 );
        students.put("Surya"  , 26 );

        // System.out.println(students);

        // System.out.println(students.get("Deepak"));


        
        // for(int x : students.values()){
        //     System.out.println(x);
        // }

        
        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }





        
        

    }
}
