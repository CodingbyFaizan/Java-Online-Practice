package lambdaexpression;

@FunctionalInterface
interface A {
    int add(int i, int j);
}


public class Demo {
    public static void main(String[] args) {
        A obj = ( i, j) ->  i + j;

        System.out.println(obj.add(4, 5));
    }
}
