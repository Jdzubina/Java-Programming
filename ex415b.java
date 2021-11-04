class ex415b {
//overrides
    static class Product{

        int productId;
        String type;
        String productName;
        double price;
        int initStock() {return 20;}

        Product(int productIdValue, String typeValue, String productNameValue, double priceValue){

            productId = productIdValue;
            type = typeValue;
            productName = productNameValue;
            price = priceValue;
        }
    Product(){

    }

    }

    static class GourmetCoffee extends Product{

        String flavor;
        @Override
        int initStock() {return 10;}

        GourmetCoffee(int productIdValue, String typeValue, String productNameValue, double priceValue, String flavorValue){

            productId = productIdValue;
            type = typeValue;
            productName = productNameValue;
            price = priceValue;
            flavor = flavorValue;

        }
    }

    public static int initStock(){
        return 20;
    }

    public static void main (String [] args) {

        Product prod1 = new Product(1, "Tea", "Green Tea", 8.99);
        System.out.println("Our first tea is " + prod1.productName + ".");

        GourmetCoffee gc1 = new GourmetCoffee(4, "Coffee", "Chocolate Donut", 8.00, "peanut butter");
        System.out.println("We have a new " + gc1.flavor + " coffee with " + gc1.initStock() + " in stock.");

    }

}