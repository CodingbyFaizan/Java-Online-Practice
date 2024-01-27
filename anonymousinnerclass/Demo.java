package anonymousinnerclass;

abstract class Surya {
    public abstract void code();

}

// class Faizan extends Surya{
//     public void code(){
//         System.out.println("coding...");
//     }
// }

public class Demo {
    public static void main(String[] args) {
        Surya obj = new Surya() {
            public void code(){
                System.out.println("coding");
            }
        } ;

        obj.code();

    }
}
