package S04_ifStatements;

import java.util.Scanner;

public class Q04_eskenaUcgen {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir ucgenin
        // 3 kenar uzunlugunu alin, ucgen eskenar ise
        // “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin uc kenarini giriniz:");
        int kenarBir = scanner.nextInt() ;
        int kenarIki = scanner.nextInt() ;
        int kenarUc = scanner.nextInt( );

        if (kenarBir==kenarIki && kenarIki==kenarUc) System.out.println("Eskenar ucgen");
    }
}
