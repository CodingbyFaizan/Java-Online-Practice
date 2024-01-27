package inheritance;

class A{
    public void show(){
        System.out.println("a show");
    }
}

class B extends A{
    public void show(){
        System.out.println("b show");
    }
}

class C extends B{
    public void show(){
        System.out.println("C show");
    }
}
public class Demo {
    public static void main(String[] args) {
        
        C obj = new C();
        obj.show();

    }   
}
