package string;



public class MutableString{
    public static void main(String[] args) {
        //mutable 
        //StringBuffer
        //StringBuilder

        // Thread safe
        StringBuffer str1 = new StringBuffer("Ritesh");
       

        // Thread safe nahi
        StringBuilder str2 = new StringBuilder("Ritesh");

        System.out.println(str1.toString().equals(str2.toString()));

        



    }
}