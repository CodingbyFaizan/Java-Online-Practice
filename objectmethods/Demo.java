package objectmethods;

class Student{

    int marks = 50;

    
    public String toString(){
        return "This is a Student object";
    }

    public boolean equals(Student obj){
        return this.marks == obj.marks;
    }

}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.toString());

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        // System.out.println(s1);
        
        
    }
}
