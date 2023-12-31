package S04_ifStatements;

import java.util.Scanner;

public class Q01_bolunebilme {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa
        // “Sayi 5’in tam kati” yazdirin.


        /*

        if (koşul) {
        // koşul doğruysa yapılacak işlemler
        }

         */



        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen bir sayi giriniz:") ;
        int sayi = scanner.nextInt() ;

        if (sayi%5==0) System.out.println("Sayi 5’in tam kati");
    }
}
