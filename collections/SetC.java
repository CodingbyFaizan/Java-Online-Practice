package collections;

import java.util.Set;
import java.util.TreeSet;
// import java.util.HashSet;

public class SetC {
    public static void main(String[] args) {
        

        //unorderd 
        //unindexing
        //no duplicate elements
        //null value allowed

        Set<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(8);
        nums.add(4);
        nums.add(20);
        nums.add(4);
        nums.add(3);
        nums.add(31);


        System.out.println(nums);

    }
}
