package S07_ternary;

import java.util.Scanner;

public class Q05_buyukSayiKucukSayi {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan iki sayi alin
        // ve buyuk olmayan sayiyi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz: ");
        int sayiBir = scanner.nextInt();
        int sayiIki = scanner.nextInt();

        System.out.println(sayiBir<sayiIki ? sayiBir : sayiIki);
    }
}
