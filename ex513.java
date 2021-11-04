public class ex513 {
// Analyse for Logic errors
    public static void main (String [] args) {
// correct
        int orderQty = 50;
        String customerStatus = "";

        if (orderQty >= 80) {
            customerStatus = "Gold";
        }else if (orderQty >= 40) {
            customerStatus = "Silver";
        }
        System.out.println("Your customer status is " + customerStatus);

        // incorrect logic
        int orderQty2 = 50;
        String customerStatus2 = "";

        if (orderQty >= 40) {
            customerStatus2 = "Silver";
        }else if (orderQty >= 80) {
            customerStatus2 = "Gold";
        }
        System.out.println("Your customer status is " + customerStatus);
    }
}
