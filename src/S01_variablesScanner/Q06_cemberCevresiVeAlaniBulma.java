package S01_variablesScanner;

import java.util.Scanner;

public class Q06_cemberCevresiVeAlaniBulma {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan bir cemberin yaricapini alip,
        // cevresini ve alanini yazdirin.
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen cemberin yaricapini giriniz:");
        double r = scanner.nextDouble() ;
        double pi = 3.14 ;

        System.out.println("Yaricapini girdiginiz cemberin cevresi: " + (2 * pi * r));
        System.out.println("Yaricapini girdiginiz cemberin alani: "+(pi * r * r));
    }
}
