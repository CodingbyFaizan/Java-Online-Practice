package userinput;

import java.util.Scanner;
import java.io.InputStream;

public class Scannerinput {
    
    public static void main(String[] args) {
        
        //Scanner class needs an object of InputStream
        //We have already object present in system class which is static 
        // eg : System.in

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        

        System.out.println("Enter your name : ");
        sc.nextLine();
        String str1 = sc.nextLine();

        System.out.println("Your number is : " + n);
        System.out.println("Your Name is : " + str1);

        sc.close();
    }

}
