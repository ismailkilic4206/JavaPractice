package S01_variablesScanner;

import java.util.Scanner;

public class Q08_degerDegistirmeUcuncuDegiskensiz {
    public static void main(String[] args) {
        // Soru 8 (Interview)- Kullanicidan iki sayi alip,
        // ucuncu bir degisken kullanmadan ikisinin
        // degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Lutfen ilk sayiyi giriniz: ") ;
        int ilkSayi = scanner.nextInt() ;

        System.out.println("Lutfen ikinci sayiyi giriniz: ") ;
        int ikinciSayi = scanner.nextInt() ;

        ilkSayi = ilkSayi + ikinciSayi ;
        ikinciSayi = ilkSayi - ikinciSayi ;
        ilkSayi = ilkSayi - ikinciSayi ;

        System.out.println("Girmis oldugunuz ilk sayinin degerini ikinci sayi ile degistirdim: " + ilkSayi);
        System.out.println("Girmis oldugunuz ikinci sayinin degerini ilk sayi ile degistirdim: " + ikinciSayi);

    }
}
