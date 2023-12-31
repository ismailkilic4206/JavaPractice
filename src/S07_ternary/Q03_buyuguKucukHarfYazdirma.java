package S07_ternary;

import java.util.Scanner;

public class Q03_buyuguKucukHarfYazdirma {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk
        // harf olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir har giriniz");
        char harf = scanner.nextLine().charAt(0);

        System.out.println(harf>='a' && harf<='z' ? Character.toUpperCase(harf) : harf );
    }
}
