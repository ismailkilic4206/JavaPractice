package S10_forLoops;

import java.util.Scanner;

public class Q03_BaslangicBitisAraasiToplama {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan baslangic ve
        // bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum
        // sayilarin toplamini yazdirin. Bitis degeri
        // baslangic degerinden kucukse,
        // uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen baslangic tamsayisini giriniz: ");
        int baslangicTamsayisi = scanner.nextInt();

        System.out.print("Lutfen bitis tamsayisini giriniz: ");
        int bitisTamsayisi = scanner.nextInt();

        int toplam = 0;
        if (baslangicTamsayisi > bitisTamsayisi) System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
        else
            for (int i = baslangicTamsayisi; i <= bitisTamsayisi ; i++) {
                toplam += toplam + i;
            }
        System.out.println(toplam);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Lutfen baslangic tamsayisini giriniz: ");
        int baslangicTamsayisi1 = scanner1.nextInt();

        System.out.print("Lutfen bitis tamsayisini giriniz: ");
        int bitisTamsayisi1 = scanner1.nextInt();

        int toplam1 = 0 ;
        if (bitisTamsayisi < baslangicTamsayisi) System.out.println("Hata Mesaji");
        else

            for (int  j = baslangicTamsayisi1;  j <= bitisTamsayisi1; j++) {
                toplam1 += toplam1 = j;
            }
        System.out.println(toplam1);

    }
}
