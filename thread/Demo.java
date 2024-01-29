package thread;

// class Counter{
//     int count = 0;

//     public void increment(){
//         count++;
//     }
// }


class A implements Runnable{
    public void run(){
        for(int i=1; i<=1000; i++){
           System.out.println("Hi");
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=1; i<=1000; i++){
            System.out.println("Hello");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        // Counter c = new Counter();

        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


    }
}
