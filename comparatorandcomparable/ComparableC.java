package comparatorandcomparable;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student>{

    int marks ;

    public Student(){
        this.marks = 10;
    }

    public Student(int marks){
        this.marks = marks;
    }

   
    public int compareTo(Student that){
        return (this.marks > that.marks) ? 1 : -1;
    }
    
}

public class ComparableC {
    public static void main(String[] args) {
        
        Student  s1 = new Student();
        Student  s2 = new Student(22);
        Student  s3 = new Student(32);
        Student  s4 = new Student(69);

        List<Student> studs = Arrays.asList(s1,s2,s3,s4);


        Collections.sort(studs);

        for( Student x : studs){
            System.out.println(x.marks);
        }


    }
}
