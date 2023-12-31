package S01_variablesScanner;

import java.util.Scanner;

public class Q04_dikdortgenAlaniYazdirma {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir dikdortgenin 2 kenar
        // uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Dikdortgenin uzun kenarini giriniz:");
        int uzunKenar = scanner.nextInt() ;

        System.out.println("Dikdortgenin uzun kenarini giriniz:");
        int kisaKenar = scanner.nextInt() ;

        System.out.println("Uzun kenari ve kisa kenari verilen dikdortgenin alani: " + (uzunKenar*kisaKenar));
    }
}
