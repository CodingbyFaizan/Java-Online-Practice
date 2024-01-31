package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(21, 45, 9, 4, 6, 2, 15);

        // filter list even number
        // even number * 2
        // reduce

        // 2 4 6
        // 4 8 12
        // 24            


        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n * 2);

        s3.forEach(n -> System.out.println(n));



        // int result = s3.reduce( 0,(c,e) -> c+e );
        // System.out.println(result);

        int result = nums.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * 2)
                        .reduce(0,(c, e) -> c + e);

        System.out.println(result);

        // System.out.println(nums);

    }
}
