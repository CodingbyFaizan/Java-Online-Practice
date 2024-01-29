package thread;

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();


        //priority will not affect the output it totally depends on OS 
        // hum sirf suggest kr sakte hai isko thode chances mile bas
        // priority values 
        // min - 0
        // normal - 5;
        // max - 10;
        // apne pas already constants bane huwe hai java bas used krna hai 

        t1.setPriority(0); // min
        t2.setPriority(10); //max

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


    }
}
