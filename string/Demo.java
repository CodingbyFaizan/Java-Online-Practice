package string;

public class Demo {
    public static void main(String[] args) {
        
     // by using literal pool
     String str1 = "Ritesh" ;
     String str3 = "Ritesh" ;

     String str5 = str1.concat(" Gupta");
     System.out.println(str5);



     // by using new keyword
     String str2 = new String("Ritesh");
     String str4 = new String("Ritesh");
       

    }
}
