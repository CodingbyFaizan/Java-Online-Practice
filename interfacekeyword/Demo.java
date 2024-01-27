package interfacekeyword;

interface B{
    //public abstract 
    //final static 

    public final static int i = 9;
    
    void show();
}




public class Demo{
    public static void main(String[] args) {
        System.out.println(B.i);
        B.i = 10;
    }
}
