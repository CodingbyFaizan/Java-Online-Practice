package userinput;

import java.util.Scanner;

public class Scannerinput {

    public static void main(String[] args) {

        // after 1.5
        // Scanner class needs an object of InputStream
        // We have already object present in system class which is static
        // eg : System.in

        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter your name");
            String name = sc.nextLine();

            System.out.println("Enter your age : ");
            int age = sc.nextInt();

            System.out.println("Name : " + name + " Age : " + age);
        }
        finally{
            sc.close();
        }

    }

}
