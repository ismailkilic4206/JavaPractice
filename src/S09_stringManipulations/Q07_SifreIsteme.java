package S09_stringManipulations;

import java.util.Scanner;

public class Q07_SifreIsteme {
    public static void main(String[] args) {

        // Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve kullaniciya
        // duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre
        // basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scanner.nextLine();

        int flag = 7 ;

        char ilkKarakter = sifre.charAt(0);
        if (!(ilkKarakter>='a' && ilkKarakter<= 'z')) {
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }
        char sonKarakter =sifre.charAt(sifre.length()-1) ;
        if (!(sonKarakter >= '0' && sonKarakter <= '9')){
            System.out.println("son karakter rakam olmali");
            flag++;
        }
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag++ ;
        }
        if (!(sifre.length() >= 10)) {
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag++;
        }
        if (flag == 7) System.out.println("sifre basariyla kaydedildi");
    }
}
