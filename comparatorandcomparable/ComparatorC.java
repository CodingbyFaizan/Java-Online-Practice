package comparatorandcomparable;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// scanner java.util
// bufferedreader java.io

public class ComparatorC {
    public static void main(String[] args) {


        // comparator uses when u want your own logic 
        // or you can use it if the data type don't support natural sorting
        Comparator<Integer> com = (x, y) -> {
            int res = (x % 10 > y % 10) ? 1 : -1;
            return res;
        };


        List<Integer> nums = Arrays.asList(31, 22, 78, 43, 55);

        Collections.sort(nums); // ascending order by default

        System.out.println("Ascending Order: " + nums);
        Collections.sort(nums, com);

        System.out.println("Own logic sorting : " + nums );

    }
}
