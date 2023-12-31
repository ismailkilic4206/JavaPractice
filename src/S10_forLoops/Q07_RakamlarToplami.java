package S10_forLoops;

import java.util.Scanner;

public class Q07_RakamlarToplami {
    public static void main(String[] args) {
        
        // Soru 7- Kullanicidan pozitif bir tamsayi alip, 
        // rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();

        int basamakSayisi = ("" + sayi).length();
        int rakamlarToplami = 0;
        int birlerBasamagi = 0;


        for (int i = 1; i <= basamakSayisi ; i++) {
            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }
        System.out.println(rakamlarToplami);
    }
}
