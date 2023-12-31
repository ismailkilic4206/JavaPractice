package S07_ternary;

import java.util.Scanner;

public class Q06_mutlakDeger {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan bir sayi alin
        // ve mutlak degerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println(Math.abs(sayi));
    }
}
