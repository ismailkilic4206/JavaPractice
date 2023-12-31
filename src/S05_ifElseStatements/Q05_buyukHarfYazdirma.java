package S05_ifElseStatements;

import java.util.Scanner;

public class Q05_buyukHarfYazdirma {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf
        // olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Bir harf giriniz: ");
        char girilenHarf = scanner.nextLine().charAt(0) ;

        if (girilenHarf >= 'a' && girilenHarf <= 'z') System.out.println(Character.toUpperCase(girilenHarf));
        else System.out.println(girilenHarf);

    }
}
