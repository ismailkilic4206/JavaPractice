package S01_variablesScanner;

import java.util.Scanner;

public class Q02_doubleVeIntCarpimVeToplam {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen int bir deger giriniz:");
        int i = scanner.nextInt() ;

        System.out.println("Lutfen double bir deger giriniz:");
        double db = scanner.nextDouble() ;

        System.out.println("girdiginiz " + i + " ve " + db + " degerlerinin toplami= " + (i+db));
        System.out.println("girdiginiz " + i + " ve " + db + " degerlerinin carpimi= " + (i*db));
    }
}
