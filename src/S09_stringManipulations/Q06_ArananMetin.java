package S09_stringManipulations;

import java.util.Scanner;

public class Q06_ArananMetin {
    public static void main(String[] args) {

        // Soru 6 : Kullanicidan bir String ve
        // aranacak metin alin. Aranan metnin String
        // icerisinde kullanimini kontrol ederek
        // asagidaki cumlelerden uygun olanini yazdirin.
        // - String aranan metni icermiyor
        // - Aranan metin String’de sadece 1 kere kullanilmis
        // - Aranan metin String’de sadece 1’den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bi string metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Lutfen aranacak metini giriniz");
        String aranacakMetin = scanner.nextLine();

        int ilkIndeks = metin.indexOf(aranacakMetin);

        if (ilkIndeks == -1){
            System.out.println("Aranacak metin, metnin icinde yoktur");
        }
        else if (metin.indexOf(aranacakMetin,ilkIndeks+1) == -1) {
            System.out.println("Aranacak metin, metnin icinde bir kez kullanilmistir");
        }
        else System.out.println("Aranacak metin, metnin icinde birden fazla kullanilmistir");

    }
}
