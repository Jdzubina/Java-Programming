public class ex211 {

    public static void main (String [] args){

        byte bagSize = 12; //hold the values from -128 (-27) to 127 (27 – 1).
        char roast = 'M'; // holds single characters
        int beans = 360; // holds a range of non-fractional values -2,147,483,648 (-231) to 2,147,483,647 (231-1).
        double price = 8.99; // holds fractional values
        short qtySold = 3000; /* If we want to save memory and byte is too small, we can use the type halfway between the two: short.
                                 At 16 bits of memory, it's half the size of int and twice the size of byte.
                                 Its range of possible values is -32,768(-215) to 32,767(215 – 1). */
        long annualQtySold = 360001; /* hold a significantly larger set of possible values.
                                     The possible values of a long are between -9,223,372,036,854,775,808 (-263)
                                     to 9,223,372,036,854,775,807 (263 – 1). */
        float costPerOz = .49f; /* However, because of the floating decimal point its range is much different.
                                   It can represent both positive and negative numbers.
                                   The smallest decimal is 1.40239846 x 10-45, and the largest value is 3.40282347 x 1038. */
        boolean caffeine = true; // holds true or false statements

    }
}
