package constrcutor;

class Student{
    public Student(){
        System.out.println("default");
    }

    public Student(int i){
        System.out.println("param");
    }
}
public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        Student s2 = new Student(5);
    }
}
