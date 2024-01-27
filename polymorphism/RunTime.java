package polymorphism;

class A{
    public void show(){
        System.out.println("A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("B show");
    }
}

public class RunTime {
    public static void main(String[] args) {
        B obj = new B();

        obj.show();
        
    }
}
