package polymorphism;

class Calc {
     public int add(int i, int j ){
        return i + j;
     }

     public int add(int i,int j , int k){
        return i+j+k;
     }
}

public class CompileTime{
    public static void main(String[] args) {
        
        Calc obj = new Calc();

        System.out.println(obj.add(4, 5));
        System.out.println(obj.add(2 ,2, 2));

    }
}
