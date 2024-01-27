package exception;


//try block 
//throw custom exception
//throws 
// finally block resource close 


class Student {

    public void foundingClass() throws Exception {
        Class.forName("Demo");
    }
}

public class Throws {
    public static void main(String[] args){
        
        Student s = new Student();
        try{

            s.foundingClass();
        }
        catch(Exception c){
            System.out.println("CLASS is not presented in the file manager!");
        }

    }
}
