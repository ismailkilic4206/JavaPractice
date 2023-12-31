package S02_dataCasting;

import java.util.Scanner;

public class Q02_verilenHarftenSonrakiUcHarfiYazdirma {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir harf alin ve
        // alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen bir harf giriniz: ");
        char girilenHarf = scanner.nextLine().charAt(0) ;


        System.out.println("Girdiginiz harf: " + girilenHarf);
        System.out.println("Girdiginiz harften bir sonraki harf: " + (char)(girilenHarf+1));
        System.out.println("Girdiginiz harften iki sonraki harf: " + (char)(girilenHarf+2));
        System.out.println("Girdiginiz harften uc sonraki harf: " + (char)(girilenHarf+3));

        System.out.println();

        System.out.println("Girdiginiz harf: " + girilenHarf);
        int sayac = 1 ;

        for (int i = (char)(girilenHarf+1); i < (char)(girilenHarf+4) ; i++) {
            System.out.println("Girdiginiz harften " + sayac + " sonraki harf: " + (char)i);
            sayac ++ ;
        }
    }
}
