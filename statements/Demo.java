package statements;

public class Demo {
    public static void main(String[] args) {

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wed");
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
            case 6:
                System.out.println("saturday");
            default:
                System.out.println("invalid choice!");
                break;

        }
    }
}
