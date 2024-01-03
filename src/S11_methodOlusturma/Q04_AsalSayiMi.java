package S11_methodOlusturma;

public class Q04_AsalSayiMi {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        // olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        // sonuclarini donduren bir method olusturun.

        int sayi = 24;

        asalSayiMi(sayi);
        asalSayiMi(17);
        asalSayiMi(51);
        asalSayiMi(31);
    }

    private static void asalSayiMi(int sayi) {
        int flag = 10;
        for (int i = 2; i < sayi ; i++) {
            if (sayi % i == 0) {
                flag ++;
                break;
            }
        }
        if (flag == 10) System.out.println(sayi + " Asal Sayidir...");
        else System.out.println(sayi + " Asal Sayi Degildir...");
    }
}
