package S01_variablesScanner;

import java.util.Scanner;

public class Q05_isimSoyisimYasYazdirma {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip
        // asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen isminizi giriniz:");
        String isim = scanner.nextLine() ;

        System.out.println("Lutfen soyisminizi giriniz:");
        String soyIsim = scanner.nextLine() ;

        System.out.println("Lutfen yasinizi giriniz:");
        int yas = scanner.nextInt();

        System.out.println("girilen bilgiler: " + isim.charAt(0) +" "+ soyIsim +" "+ yas);
    }
}
