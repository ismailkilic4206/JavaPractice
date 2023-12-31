package S01_variablesScanner;

import java.util.Scanner;

public class Q07_degerDegistirme {
    public static void main(String[] args) {
        // Soru 7 (Interview)- Kullanicidan iki sayi alip
        // ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen ilk sayiyi giriniz:");
        int ilkSayi = scanner.nextInt() ;

        System.out.println("Lutfen ikinci sayiyi giriniz:");
        int ikinciSayi = scanner.nextInt() ;

        int temp = 0 ;

        temp = ikinciSayi ;
        ikinciSayi = ilkSayi ;
        ilkSayi = temp ;

        System.out.println("Girmis oldugunuz ilk sayinin degerini ikinci sayi ile degistirdim: " + ilkSayi);
        System.out.println("Girmis oldugunuz ikinci sayinin degerini ilk sayi ile degistirdim: " + ikinciSayi);
    }
}
