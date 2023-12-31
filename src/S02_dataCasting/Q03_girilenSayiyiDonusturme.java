package S02_dataCasting;

import java.util.Scanner;

public class Q03_girilenSayiyiDonusturme {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir sayi alin,
        // kullanici kac degerini girerse girsin, o sayiyi -128
        // ile 127 arasindaki bir sayiya donusturup yazdirin. (char a donusecek)

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen bir sayi giriniz:");
        int sayi = scanner.nextInt() ;

        char ch = (char) sayi;
        int x = (int) ch ;

        System.out.println("İstenilen dogrultuda degerimiz: " + x); // İstenilen dogrultuda degerimiz: 500
    }
}
