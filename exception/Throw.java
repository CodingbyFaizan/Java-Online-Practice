package exception;

class NewException extends Exception{
    public NewException(String msg){
        super(msg);
    }
}

public class Throw {
    public static void main(String[] args) {
        
        try{
            throw new NewException("This is my own exception");
        }
        catch(NewException n){
            System.out.println(n);
        }

    }
}
