package S10_forLoops;

import java.util.Scanner;

public class Q05_Faktoriyel {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini
        // hesaplayin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir sayi giriniz");
        int sayi = scanner.nextInt();

        int faktoriyel = 1 ;

        for (int i = sayi; i >= 1 ; i--) {
            faktoriyel *= i;
        }
        System.out.println(faktoriyel);

    }
}
