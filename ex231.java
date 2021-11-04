public class ex231 {
//arrays
    public static void main (String [] args){

        String [] cocoaBrands = new String[4];

        cocoaBrands[0] = "Regular";
        cocoaBrands[1] = "Dark Chocolate";
        cocoaBrands[2] = null;
        cocoaBrands[3] = "Sugar Free";

        System.out.println(cocoaBrands[1]);

        for (String cocoa: cocoaBrands) {
            System.out.println(cocoa);
        }
    }
}
