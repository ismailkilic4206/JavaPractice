package S03_modulus;

import java.util.Scanner;

public class Q01_modulus {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip
        // rakamlar toplamini bulalim
        // Ipucu 1: Sayi % 10 => Bize son basamagi verir
        // 1469 % 10 = 9
        // Ipucu 2: Int Sayi /10 => Bize son basamak haric sayiyi verir
        // int sayi=1469;
        // sayi = sayi / 10 =>
        // sayi’ya 146 degerini atar

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("4 basamakli bir sayi giriniz:");
        int sayi = scanner.nextInt() ;

        int toplam = 0 ;
        int birler = 0 ;

        birler = sayi % 10 ;
        toplam = toplam + birler ;
        sayi = sayi / 10 ;

        birler = sayi % 10 ;
        toplam = toplam + birler ;
        sayi = sayi / 10 ;

        birler = sayi % 10 ;
        toplam = toplam + birler ;
        sayi = sayi / 10 ;

        birler = sayi % 10 ;
        toplam = toplam + birler ;
        sayi = sayi / 10 ;

        System.out.println("Girilen sayilarin rakamlar toplami: "+toplam);
    }
}
