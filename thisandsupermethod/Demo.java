package thisandsupermethod;


class A{
    public A(){
        System.out.println("A default");
    }

    public A(int i){
        System.out.println("A param");
    }
}

class B extends A {

    public B(){
        super();
        System.out.println("B default");
    }

    
    public B(int i){
        this();
        System.out.println("B param");
    }
}
public class Demo {
    public static void main(String[] args) {
        B obj = new B(5);

        
    }
}
