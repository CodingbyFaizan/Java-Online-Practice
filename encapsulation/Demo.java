package encapsulation;

class Student{
    private String name;
    private int age;


    // name
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    // roll no

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }


}

public class Demo{
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Faizan");
        s1.setAge(21);

        System.out.println(s1.getName() + " : " +  s1.getAge());
    }
}





