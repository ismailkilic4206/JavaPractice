package S02_dataCasting;

import java.util.Scanner;

public class Q05_doubleVeItnSayilarinBolumundeTamKismiYazdirma {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir double, bir tamsayi alin,
        // double sayiyi ikinci sayiya bolun
        // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Double bir sayi giriniz:");
        double sayi1 = scanner.nextDouble() ;

        System.out.println("Int bir sayi giriniz:");
        int sayi2 = scanner.nextInt() ;

        int bolum = (int) (sayi1 / sayi2);
        System.out.println("Double bir sayinin int bir sayiya bolumunde bolumun tamsayi kismi: " + bolum);

        double bolum1 = sayi1 / sayi2 ;
        System.out.println("Double bir sayinin int bir sayiya bolumunde bolum degeri: " + bolum1);
    }
}
