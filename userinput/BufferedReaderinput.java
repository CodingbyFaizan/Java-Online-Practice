package userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderinput {
    public static void main(String[] args){

        // before java 1.5
        // BufferedReader needs an object of InputStreamReader
        // InputStreamReader needs an object of InputStream
        // We have already object present in system class which is static
        // eg : System.in

        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number : ");
        try {
            String str = br.readLine();
            System.out.println(str);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println("something goes wrong with io");
        }

        
        
    }
}
