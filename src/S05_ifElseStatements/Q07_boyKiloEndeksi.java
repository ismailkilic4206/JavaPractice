package S05_ifElseStatements;

import java.util.Scanner;

public class Q07_boyKiloEndeksi {
    public static void main(String[] args) {
        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm)
        // isteyip vucut kitle endeksini
        // hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse
        // obez, 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal, 20’den kucukse
        // zayif yazdirin.


        /*

        if (koşul1) {
        // koşul1 doğru ise bu kod bloğu çalışacaktır.
        } else if (koşul2) {
        // eğer koşul1 doğru değil ise ve koşul2 doğru ise bu kod bloğu çalışacaktır.
        } else {
        // koşul1 ve koşul2 doğru değil ise bu kod bloğu çalışacaktır.
        }

         */


        Scanner scanner = new Scanner(System.in );
        System.out.println("Lutfen kilonuzu giriniz:");
        int kilo = scanner.nextInt() ;
        System.out.println("Lutfen boyunuzu giriniz:");
        int boy = scanner.nextInt();

        double endeks = ((kilo*10000) / (boy *boy)) ;

        if (endeks>30) System.out.println("obez");
        else if (endeks<=30 && endeks>=25) System.out.println("kilolu");
        else if (endeks<=25 && endeks>=20) System.out.println("normal");
        else System.out.println("zayif");
    }
}
