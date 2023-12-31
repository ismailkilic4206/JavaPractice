package S05_ifElseStatements;

import java.util.Scanner;

public class Q02_gectiKaldi {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan notunu alin 50 veya
        // daha buyukse ”Sinifi Gectin”, 50’den
        // kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen notonuzu giriniz:");
        int not = scanner.nextInt() ;

        if (not >= 50) System.out.println("Sinifi Gectin");
        else System.out.println("Maalesef kaldin");
    }
}
