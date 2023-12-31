package S09_stringManipulations;

public class Q02_StringFiyatToplama {
    public static void main(String[] args) {

        // Soru 2 : Kullanicinin belirli bir formatta verdigi
        // String fiyatlari toplayip yazdirin.
        // input1 : “15.30 €” , input2 : “11.40 €”
        // output : 26.70 €

        String input1 = "15.30 €";
        String input2 = "11.40 €";
        String input3 = "26.70 €";

        input1 = input1.replaceAll("\\D", "");
        input2 = input2.replaceAll("\\D", "");
        input3 = input3.replaceAll("\\D", "");

        double fiyat1 = Double.parseDouble(input1);
        double fiyat2 = Double.parseDouble(input2);
        double fiyat3 = Double.parseDouble(input3);

        System.out.println((fiyat1+fiyat2+fiyat3)/100 + " €");
    }
}
