package S09_stringManipulations;

import java.util.Scanner;

public class Q05_IndexOf {
    public static void main(String[] args) {

        // Soru 5 : Kullanicidan bir String ve
        // aranacak metin alin. String’in aranan metni
        // icerip icermedigini indexOf( ) method’u kullanarak yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bi string metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Lutfen aranacak metini giriniz");
        String aranacakMetin = scanner.nextLine();


        if ((metin.indexOf(aranacakMetin)) >= 0 && (metin.indexOf(aranacakMetin)) <= metin.length()){
            System.out.println("Aranan metin metnin icinde vardir..");
        } else System.out.println("Aranan metin metnin icinde yoktur..");


    }
}
