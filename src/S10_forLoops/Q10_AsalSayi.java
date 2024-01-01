package S10_forLoops;

import java.util.Scanner;

public class Q10_AsalSayi {
    public static void main(String[] args) {
        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi giriniz: ");
        int girilenTamsayi = scanner.nextInt();

        int flag = 7;
        for (int i = 2; i < girilenTamsayi ; i++) {
            if (girilenTamsayi % i == 0){
                flag ++;
                break;
            }
        }
        if (flag == 7) System.out.println(girilenTamsayi + " Asal Sayidir..");
        else System.out.println(girilenTamsayi + " Asal Sayi Degildir..");
    }
}
