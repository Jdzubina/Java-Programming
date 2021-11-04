public class ex224 {

    public static void main (String [] args){

        String name = "Tracy";
        int qty = 5;
        String product = "Mint Cocoa";

        System.out.println (name + ", thank you for the order of " + Integer.toString(qty) + " cans of " + product + ".");
        System.out.println (name + ", thank you for the order of " + String.valueOf(qty) + " cans of " + product + ".");
        System.out.println (name + ", thank you for the order of " + qty + " cans of " + product + ".");

    }

}
