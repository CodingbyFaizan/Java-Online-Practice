package thisandsuper;

class A{

    // int x ;

    public A(){
        System.out.println("A Default ");
    }
    public A(int x){
        System.out.println("A param ");
    }

}


class B extends A{
    public B(){
        System.out.println("B default ");
    }
    public B(int y){
        this();
        System.out.println("B param");
    }
}


class Demo{
    public static void main(String[] args) {
        
        B obj = new B(0);

    }
}