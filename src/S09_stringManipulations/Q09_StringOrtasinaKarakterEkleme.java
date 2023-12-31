package S09_stringManipulations;

import java.util.Scanner;

public class Q09_StringOrtasinaKarakterEkleme {
    public static void main(String[] args) {
        // Soru 6 : Kullanicidan bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina
        // :) ekleyin, String’in uzunlugu tek sayi ise
        // ortadaki harfi silin ve yerine :(
        // yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen string giriniz");
        String str = scanner.nextLine();

        if (str.length() % 2 == 0) {
            System.out.println(str.substring(0,str.length()/2)
                    + ":)"
                    + str.substring(str.length()/2));
        }
        else {
            System.out.println(str.substring(0,str.length()/2)
                    + ":("
                    + str.substring(str.length()/2+1));
        }

    }
}
