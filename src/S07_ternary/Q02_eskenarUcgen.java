package S07_ternary;

import java.util.Scanner;

public class Q02_eskenarUcgen {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir ucgenin
        // 3 kenar uzunlugunu alin, ucgen eskenar ise
        // “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenarlarini giriniz: ");
        double kenarBir = scanner.nextDouble();
        double kenarIki = scanner.nextDouble();
        double kenarUc = scanner.nextDouble();

        System.out.println(kenarBir==kenarIki && kenarIki==kenarUc && kenarBir>0 ? "Eskena Ucgendir" : "Eskenar Ucgen Degildir");
    }
}
