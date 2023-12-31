package S01_variablesScanner;

import java.util.Scanner;

public class Q01_ucFarkliTurdeDegerAlma {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan uc farkli data turunde deger alip,
        // girilen degerleri aciklamalariyla yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen int turunde deger giriniz: ");
        int girilenInt = scanner.nextInt();
        System.out.println("Girdiginiz int olup degeri: " + girilenInt);

        System.out.println("Lutfen booleen turunde deger giriniz: ");
        boolean girilenBl = scanner.nextBoolean();
        System.out.println("Girdiginiz boolean olup degeri: " + girilenBl);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lutfen String turunde deger giriniz: ");
        String girilenStr = scanner1.nextLine() ;
        System.out.println("Girdiginiz String olup degeri: " + girilenStr);
    }
}
