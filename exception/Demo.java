package exception;

public class Demo {
    public static void main(String[] args) {

       int i = 10;
       int j = 0;
       int res;

       try{
         res = i / j;
       }
       catch(Exception e){
        System.out.println(e);
       }
       finally{
        System.out.println("bye");
       }

    }
}