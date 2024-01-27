package abstractkeywrod;

//partially abstraction

abstract class Surya{
    public abstract void code(); 
}

abstract class Jarale extends Surya{
    public abstract void code();
}

class Faizan extends Jarale{
    public void code(){
        System.out.println("coding....");
    }
}

public class Demo {
    public static void main(String[] args) {
        Surya obj = new Faizan(); //upcasting
        obj.code();

        Faizan obj2 = (Faizan) obj;
        
    }
}
