package finalkeywrod;

class Calc{

    public final double pi = 3.17;

    public final void show(){
        System.out.println("by Ritesh");
    }
}

class AdvCalc extends Calc{
    public void config(){
        System.out.println("new config");
    }
}



public class Demo {
    public static void main(String[] args) {

        AdvCalc obj = new AdvCalc();
        // obj.show();

    }
}
