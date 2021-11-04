public class ex514 {
// console exceptions
    public static void main (String [] args) {

        String [] cocoaBrands = new String[4];

        cocoaBrands[0] = "Regular";
        cocoaBrands[1] = "Dark Chocolate";
        cocoaBrands[2] = null;
        cocoaBrands[3] = "Sugar free";

        System.out.println(cocoaBrands[1]);
        System.out.println(cocoaBrands[4]); // out of bounds exception error cause

    }
}
