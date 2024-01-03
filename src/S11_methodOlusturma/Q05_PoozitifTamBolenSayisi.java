package S11_methodOlusturma;

public class Q05_PoozitifTamBolenSayisi {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //bolenleri sayisini bulup bize donduren bir method olusturun

        int sayi = 42;

        pozitifTamBolenSayisi(sayi);
        pozitifTamBolenSayisi(11);
        pozitifTamBolenSayisi(56);
        pozitifTamBolenSayisi(111);
        pozitifTamBolenSayisi(2024);
    }

    private static void pozitifTamBolenSayisi(int sayi) {

        int sayac = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}
