package operators;

public class Demo {
    public static void main(String[] args) {
        int age = 18;

        if (age < 18) {
            // return -1;
        } 
        else{
        //    return 1;
        }

        int result = (age <= 18) ? -1 : 1 ;

        System.out.println(result);


    }
}
