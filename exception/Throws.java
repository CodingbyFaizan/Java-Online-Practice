package exception;


class Student{
    public void show() throws ClassNotFoundException{
        Class.forName("Demo");
    }
}

public class Throws {
    public static void main(String[] args){
        
        Student obj = new Student();
        
        try{
            obj.show();
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }
        finally{
            System.out.println("Bye");
        }
    }
}
