import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ex523b {
// Try Catch Finally - Exception Class Types 2 file not found

    public static void main (String [] args) {

        FileInputStream testFile = null;

        try {
            testFile = new FileInputStream("test.txt");
            System.out.println("Test file found");
        }
        catch(FileNotFoundException ex) {
            System.out.println("Test file found");
        }
        catch (RuntimeException ex) {
            System.out.println("You have a different problem. ");
        }
        finally {
            System.out.println("Code complete. ");
        }


    }

}
