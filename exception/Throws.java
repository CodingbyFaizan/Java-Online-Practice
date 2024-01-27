package exception;


//try block 
//throw custom exception
//throws 
// finally block resource close 

// class Student{
//     public void show() throws ClassNotFoundException{
//         Class.forName("Demo");
//     }
// }

public class Throws {
    public static void main(String[] args){
        
        try{
            throw new ClassNotFoundException("error");
        }
        catch(ClassNotFoundException c){
            System.out.println(c);
        }

    }
}
