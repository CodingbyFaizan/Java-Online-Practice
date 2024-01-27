package upcastinganddowncasting;

class Computer{
 
    public void show1(){
        System.out.println("A show1");
    }
}

class Laptop extends Computer{
    public void show2(){
        System.out.println("B show2");
    }
}

public class Demo {
    
    public static void main(String[] args) {
        
        Computer obj1 = new Laptop();  //upcasting

        obj1.show1();
        obj1.show2();

        Laptop obj2 = (Laptop) obj1; //downcasting
        obj2.show1();
        obj2.show2();

    }

}
