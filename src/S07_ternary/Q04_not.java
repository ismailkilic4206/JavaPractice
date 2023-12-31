package S07_ternary;

import java.util.Scanner;

public class Q04_not {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan notunu alin 50 veya
        // daha buyukse ”Sinifi Gectin”, 50’den
        // kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz: ");
        int not = scanner.nextInt();

        System.out.println(not>=50 ? "Sinifi Gectin" : "Maalesef kaldin");
    }
}
