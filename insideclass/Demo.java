package insideclass;

// import insideclass.OuterClass.InnerClass;

// //inside class
class A{
    int marks;

    public void show(){
        System.out.println("a show");
    }

    class B{
        public void config(){
            System.out.println("b config");
        }
    }
}





public class Demo {
    public static void main(String[] args) {


        A obj1 = new A();

        A.B obj2 = obj1.new B();


    }
}





// class A {
//     private String secret = "I'm a secret!";

//     public String show(){
//         return "Outer method";
//     }

//     class B {
//         public void revealSecret() {
//             System.out.println("Inner Method : " + show());
//         }
//     }

// }

// public class Demo {
//     public static void main(String[] args) {
//         A outer = new A();
        
//         A.B inner = outer.new B();

//         inner.revealSecret();
        
//         // Outputs: The secret is: I'm a secret!
//     }
// }

