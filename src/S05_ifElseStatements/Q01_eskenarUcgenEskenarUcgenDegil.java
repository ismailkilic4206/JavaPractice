package S05_ifElseStatements;

import java.util.Scanner;

public class Q01_eskenarUcgenEskenarUcgenDegil {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir ucgenin 3
        // kenar uzunlugunu alin, ucgen eskenar ise
        // “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.


        /*

        if (koşul) {
        // koşul doğru ise çalışacak kod bloğu
        } else {
        // koşul yanlış ise çalışacak kod bloğu
        }

         */


        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Ucgenin kenarlarini giriniz");
        int kenarBir = scanner.nextInt() ;
        int kenarIki = scanner.nextInt() ;
        int kenarUc = scanner.nextInt() ;

        if (kenarBir == kenarIki && kenarIki == kenarUc) {
            System.out.println("Eskenar ucgen");
        }
        else System.out.println("Eskenar degil");
    }
}
