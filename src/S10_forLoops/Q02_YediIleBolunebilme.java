package S10_forLoops;

import java.util.Scanner;

public class Q02_YediIleBolunebilme {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan pozitif bir tamsayi alin,
        // 1’den girilen sayiya kadar(girilen sayi
        // dahil) 7 ile bolunebilen sayilari yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen bir pzitif tamsayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        for (int i = 1; i <= girilenSayi ; i++) {
            if (i % 7 == 0) System.out.print(i + " ");
        }
    }
}
