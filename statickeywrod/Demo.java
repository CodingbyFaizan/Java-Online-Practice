package statickeywrod;

class Student{

    //instance variable 
    String name;
    int rollno;


    static String dept;


    {
        System.out.println("instance block");
    }

    public Student(String name , int rollno){
        System.out.println("constructor");
        this.name = name;
        this.rollno = rollno;
        
    }

    public static void show(Student s){
        System.out.println(s.name + " : " + s.rollno + " : " + Student.dept);
    }

    public static void show1(){
        System.out.println("showing");
    }
    public int add(int i, int j){
        return i+j;
    }

    static{
        dept = "COMPS";
        System.out.println("static block called");
    }


}

public class Demo {
    
    public static void main(String[] args) {
           
        // Student s1 = new Student("Faizan", 1);

        // Student s2 = new Student("Ritesh" , 2);

        // Student.dept ="IT";
        // Student.show(s1);
        // Student.show(s2);

        Student.show1();

    }

}
