package S02_dataCasting;

import java.util.Scanner;

public class Q04_doubleVerilenIkiSayininBolumununTamKisminiYazdirma {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan iki double sayi alin,
        // ilk sayiyi ikinci sayiya bolun ve bolum
        // isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("İlk double sayiyi giriniz:");
        double sayi1 = scanner.nextDouble() ;

        System.out.println("Ikinci double sayiyi giriniz:");
        double sayi2 = scanner.nextDouble() ;

        int bolum = (int) (sayi1/sayi2);
        System.out.println("Iki double sayinin bolumlerinde bolum degerinin tam sayi kismi: " + bolum);
        double bolum1 = sayi1/sayi2 ;
        System.out.println("Iki double sayinin bolumlerinde bolum degerinin: " + bolum1);
    }
}
