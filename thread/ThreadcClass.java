package thread;

// extends Thread class
// implements Runnable interface 

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            }
        }
    }


public class ThreadcClass {
    public static void main(String[] args) {

        A t1 = new A();
        B t2 = new B();

        t1.start();
        t2.start();

        t1.setPriority(Thread.NORM_PRIORITY);
        
        System.out.println(t1.getPriority());

    }
}
