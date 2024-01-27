package arrays;

class Student{

    public void show(){
        System.out.println("show");
    }
}

public class ArrObject {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = null;

        Student arr[] = { s1,s2,s3 };

        arr[2] = new Student();

        for(Student s : arr)
            s.show();







    }
}
