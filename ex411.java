public class ex411 {

    static class Product{

        int productId;
        String type;
        String productName;
        double price;

        Product(int productIdValue, String typeValue, String productNameValue, double priceValue){

            productId = productIdValue;
            type = typeValue;
            productName = productNameValue;
            price = priceValue;

        }
    }

    public static void main (String [] args){

        Product prod1 = new Product(1, "Tea", "Green Tea",8.99);
        System.out.println("Our first tea is " + prod1.productName + ".");

    }
}
