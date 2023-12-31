package S04_ifStatements;

import java.util.Scanner;

public class Q05_gectinKaldin {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan notunu alin 50 veya
        // daha buyukse ”Sinifi Gectin”, 50’den
        // kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen notunuzu giriniz:") ;
        int not = scanner.nextInt() ;


        if (not >= 50) System.out.println("Sinifi Gectin");
        if (not < 50) System.out.println("Maalesef kaldin");
    }
}
