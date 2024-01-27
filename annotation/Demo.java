package annotation;

@FunctionalInterface 
interface A{
    void show();
}

@Deprecated
class A{
    public void thisIsAMethodOfAClass(){
        System.out.println("a method");
    }
}

class B extends A{

    @Override
    public void thisIsAMethodOfAClass(){
        System.out.println("b method");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.thisIsAMethodOfAClass();



    }
}
