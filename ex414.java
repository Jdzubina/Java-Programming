public class ex414 {

//The this keyword
static class Product{

    int productId;
    String type;
    String productName;
    double price;

    Product(int productIdValue, String typeValue, String productNameValue, Double priceValue){

        productId = productIdValue;
        type = typeValue;
        productName = productNameValue;
        price = priceValue;

    }

    Product(int productIdValue, String typeValue, String productNameValue){

        productId = productIdValue;
        type = typeValue;
        productName = productNameValue;
        price = 9.99;
    }

    Product(){
        this(3, "Coffee", "Decaf", 9.99);
    }

}

    public static void main (String [] args){


        Product prod1 = new Product(1, "Tea", "Green Tea, 8.99");
        System.out.println("Our first tea is " + prod1.productName + ".");

        Product prod2 = new Product(2, "Coffee", "House Blend");
        System.out.println("The " + prod2.productName + "brand sells for " + prod2.price );

        Product prod3 = new Product();
        System.out.println("The " + prod3.productName + " brand sells for " + prod3.price);

    }

}
