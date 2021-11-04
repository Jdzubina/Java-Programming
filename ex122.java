import java.util.Scanner;
// user inputs/scanner
public class ex122 {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Thank you for visiting us, what is your name?");
        String name = in.nextLine();
        System.out.println("Welcome " + name);
    }
}
