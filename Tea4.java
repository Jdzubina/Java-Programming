public class Tea4 {
// use static final to create constants
    // objective 4.2.1

    protected int teaID;
    public String teaType;
    public String teaName;
    public double teaPrice;
    private double salePrice = teaPrice * .7;

    Tea4 (int teaID, String teaType, String teaName, double teaPrice){
        this.teaID = teaID;
        this.teaType = teaType;
        this.teaName = teaName;
        this.teaPrice = teaPrice;
        this.salePrice = teaPrice * .7;
    }

    Tea4() {

    }


    public static void main (String [] args){

        Tea4 t4 = new Tea4(1, "Herbal", "Mint Green", 9.99);
        System.out.println("Our first tea is " + t4.teaName + " sells for " + t4.teaPrice);

        GourmetTea4 gt4 = new GourmetTea4(2, "Herbal", "Super Lotus", "Lotus");
        System.out.println("We have a new gourmet tea called " + gt4.teaName + " on sale for " + gt4.gourmetSalePrice + " and ships for " + gt4.gourmetShipping + ".");
    }

}

class GourmetTea4 extends Tea4{

    public String gourmetBrand;
    static double gourmetSalePrice = 10.99;
    static final double gourmetShipping = 2.99;

    GourmetTea4(int teaID, String teaType, String teaName, String gourmetBrand){

        this.teaID = teaID;
        this.teaType = teaType;
        this.teaName = teaName;
        this.gourmetBrand = gourmetBrand;
        this.teaPrice = 12.99;
        this.gourmetSalePrice = 11.99;

    }
}


