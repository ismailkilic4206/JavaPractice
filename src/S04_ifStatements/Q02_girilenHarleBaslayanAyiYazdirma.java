package S04_ifStatements;

import java.util.Scanner;

public class Q02_girilenHarleBaslayanAyiYazdirma {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir harf alin,
        // harf ile baslayan bir ay varsa yazdirin.
        // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen bir harf giriniz:");
        char harf = scanner.next().charAt(0);

        if (harf == 'o' || harf == 'O') System.out.println("OCAK");
        if (harf == 's' || harf == 'S') System.out.println("SUBAT");
        if (harf == 'm' || harf == 'M') System.out.println("MART"+"\nMAYIS");
        if (harf == 'n' || harf == 'N') System.out.println("NİSAN");
        if (harf == 'h' || harf == 'H') System.out.println("HAZİRAN");
        if (harf == 't' || harf == 'T') System.out.println("TEMMUZ");
        if (harf == 'a' || harf == 'A') System.out.println("AGUSTOS"+"\nARALIK");
        if (harf == 'e' || harf == 'E') System.out.println("EYLUL"+"\nEKİM");
        if (harf == 'k' || harf == 'K') System.out.println("KASIM");
    }
}
