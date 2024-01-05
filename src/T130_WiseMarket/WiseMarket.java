package T130_WiseMarket;

import java.time.LocalDateTime;
import java.util.Scanner;

public class WiseMarket {
    /*
   ====================PROJEMIZ===================================
 ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ .
   2 MANAV ÜRÜNLERİ
   3 MARKET ÜRÜNLERİ
   secime göre;
   4-urunleri listele ve
   5-fiyatlari gelsin
   6-Alışveriş bitince fiş yazdırsın.
   7- Fiş yazdırdıktan sonra da çıkış yapılsın.
*/
    static Scanner scan=new Scanner(System.in);
    static int urunKodu;
    static int urunFiyati;
    static String urunAdi;
    static int urunAdedi;
    static int toplam;
    static  String sepet = "\n";
    static boolean ekUrun = false;
    public static void main(String[] args) {
        girisEkrani();
    }
    private static void girisEkrani(){
        System.out.println("====================T130 - WISE MARKET====================");
        System.out.println("-----------------------Hoş Geldiniz-----------------------");
        System.out.println("Lutfen bir secim yapiniz: \n1.)Sarkuteri Reyonu\n2.)Manav Reyonu\n3.)Market Reyonu\n4.)Fiş Yazdırma\n5.)Çıkış");
        int secim = scan.nextInt();

        switch (secim){
            case 1:
                sarkuteri();
                break;
            case 2:
                manav();
                break;
            case 3:
                market();
                break;
            case 4:
                fisYazdir();
                break;
            case 5:
                cikis();
                break;
            default:
                System.out.println("Gecersiz bir secim yaptiniz\nLutfen tekrar deneyiniz: ");
                girisEkrani();
                break;
        }
    }
    private static void sarkuteri(){
        System.out.println("====================T130 - WISE MARKET====================");
        System.out.println("-------------Sarkuteri Reyonuna Hoş Geldiniz--------------");
        System.out.println("101.)Peynir 20$\n102.)Sut 15$\n103.)Yogurt 15$\n104.)Yumurta 10$\n105.)Sucuk 25$");
        System.out.println("Lutfen urun kodunu giriniz: ");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (!(urunKodu == 0)) {
                System.out.print("Kaç Paket almak istersiniz: ");
                urunAdedi = scan.nextInt();

                switch (urunKodu) {
                    case 101:
                        urunAdi = "Peynir";
                        urunFiyati = 20;
                        System.out.println(urunAdedi + " Paket " + urunAdi + " fiyati: " + (urunAdedi * urunFiyati) + "$");
                        break;
                    case 102:
                        urunAdi = "Sut";
                        urunFiyati = 15;
                        System.out.println(urunAdedi + " Paket " + urunAdi + " fiyati: " + (urunAdedi * urunFiyati) + "$");
                        break;
                    case 103:
                        urunAdi = "Yogurt";
                        urunFiyati = 15;
                        System.out.println(urunAdedi + " Paket " + urunAdi + " fiyati: " + (urunAdedi * urunFiyati) + "$");
                        break;
                    case 104:
                        urunAdi = "Yumurta";
                        urunFiyati = 10;
                        System.out.println(urunAdedi + " Paket " + urunAdi + " fiyati: " + (urunAdedi * urunFiyati) + "$");
                        break;
                    case 105:
                        urunAdi = "Sucuk";
                        urunFiyati = 25;
                        System.out.println(urunAdedi + " Paket " + urunAdi + " fiyati: " + (urunAdedi * urunFiyati) + "$");
                        break;
                    default:
                        System.out.println("Gecersiz bir secim yaptiniz\nLutfen tekrar deneyiniz: ");
                        sarkuteri();
                        break;
                }
                urunFiyati = urunAdedi * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Toplam tutar: " + toplam);
                sepet += urunAdi + " : " + urunFiyati + " $\n";
                System.out.println();
                System.out.println("Başka bir ürün almak isterseniz, ürün kodunu giriniz\nAna Menüye dönmek için 0 yazıp Enter tuşuna basınız");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
        ekUrun = false;
    }
    private static void manav(){
        System.out.println("====================T130 - WISE MARKET====================");
        System.out.println("---------------Manav Reyonuna Hoş Geldiniz----------------");
        System.out.println("201.)Mandalina 8$\n202.)Portakal 10$\n203.)Kivi 10$\n204.)Muz 10$\n205.)Elma 6$");
        System.out.println("Lutfen urun kodunu giriniz: ");
        while (!ekUrun){
            urunKodu = scan.nextInt();
            if (!(urunKodu == 0)){
                System.out.print("Kaç Paket almak istersiniz: ");
                urunAdedi = scan.nextInt();
                switch (urunKodu){
                    case 201:
                        urunAdi="Mandalina";
                        urunFiyati=8;
                        System.out.println(urunAdedi+" Paket "+urunAdi+" fiyatı: "+(urunAdedi*urunFiyati)+" $");
                        break;
                    case 202:
                        urunAdi="Portakal";
                        urunFiyati=10;
                        System.out.println(urunAdedi+" Paket "+urunAdi+" fiyatı: "+(urunAdedi*urunFiyati)+" $");
                        break;
                    case 203:
                        urunAdi="Kivi";
                        urunFiyati=10;
                        System.out.println(urunAdedi+" Paket "+urunAdi+" fiyatı: "+(urunAdedi*urunFiyati)+" $");
                        break;
                    case 204:
                        urunAdi="Muz";
                        urunFiyati=10;
                        System.out.println(urunAdedi+" Paket "+urunAdi+" fiyatı: "+(urunAdedi*urunFiyati)+" $");
                        break;
                    case 205:
                        urunAdi="Elma";
                        urunFiyati=6;
                        System.out.println(urunAdedi+" Paket "+urunAdi+" fiyatı: "+(urunAdedi*urunFiyati)+" $");
                        break;
                    default:
                        System.out.println("Gecersiz bir secim yaptiniz\nLutfen tekrar deneyiniz: ");
                        manav();
                        break;
                }
                urunFiyati = urunAdedi * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Toplam tutar: " + toplam);
                sepet+=urunAdi+" : "+urunFiyati+" $\n";
                System.out.println("Başka bir ürün almak isterseniz, ürün kodunu giriniz\nAna Menüye dönmek için 0 yazıp Enter tuşuna basınız");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
        ekUrun = false;

    }
    private static void market(){
        System.out.println("====================T130 - WISE MARKET====================");
        System.out.println("---------------Market Reyonuna Hoş Geldiniz---------------");
        System.out.println("301.)Biskuvi 3$\n302.)Cikolata 5$\n303.)Cola 8$\n304.)Cekirdek 3$\n305.)Kurabiye 10$");
        System.out.println("Lutfen urun kodunu giriniz: ");
        while (!ekUrun){
            urunKodu = scan.nextInt();
            if (!(urunKodu == 0)){
                System.out.print("Kaç Paket almak istersiniz: ");
                urunAdedi = scan.nextInt();
                switch (urunKodu){
                    case 301:
                        urunAdi="Biskuvi";
                        urunFiyati=3;
                        System.out.println(urunAdedi+" Paket "+urunAdi+" fiyatı: "+(urunAdedi*urunFiyati)+" $");
                        break;
                    case 302:
                        urunAdi="Cikolata";
                        urunFiyati=5;
                        System.out.println(urunAdedi+" Paket "+urunAdi+" fiyatı: "+(urunAdedi*urunFiyati)+" $");
                        break;
                    case 303:
                        urunAdi="Cola";
                        urunFiyati=8;
                        System.out.println(urunAdedi+" Paket "+urunAdi+" fiyatı: "+(urunAdedi*urunFiyati)+" $");
                        break;
                    case 304:
                        urunAdi="Cekirdek";
                        urunFiyati=3;
                        System.out.println(urunAdedi+" Paket "+urunAdi+" fiyatı: "+(urunAdedi*urunFiyati)+" $");
                        break;
                    case 305:
                        urunAdi="Kurabiye";
                        urunFiyati=10;
                        System.out.println(urunAdedi+" Paket "+urunAdi+" fiyatı: "+(urunAdedi*urunFiyati)+" $");
                        break;
                    default:
                        System.out.println("Gecersiz bir secim yaptiniz\nLutfen tekrar deneyiniz: ");
                        market();
                        break;
                }
                urunFiyati = urunAdedi * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Toplam tutar: " + toplam);
                sepet+=urunAdi+" : "+urunFiyati+" $\n";
                System.out.println("Başka bir ürün almak isterseniz, ürün kodunu giriniz\nAna Menüye dönmek için 0 yazıp Enter tuşuna basınız");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
        ekUrun = false;

    }
    private static void fisYazdir(){
        System.out.println("====================T130 - WISE MARKET====================");
        System.out.println("----------------------Alisveris Fisi----------------------");
        System.out.println("--------------------Iyi Gunler Dileriz--------------------");
        System.out.println("");
        System.out.println(sepet);
        System.out.println("==========================================================");
        System.out.println("TOPLAM TUTAR: " + toplam + "$");
        System.out.println("KDV: " + (toplam * 0.20));
        toplam += (toplam * 0.20);
        System.out.println("Odeneccek Tutar: " + toplam + "$ KDV Dahil");
        System.out.println("Ödenen Miktar: ");
        int odeme= scan.nextInt();
        if (odeme<toplam){
            System.out.println("Yapılan ödeme toplam tutarı karşılamıyor. "+(toplam-odeme)+" kadar daha ödeme yapamlısınz.");
        }else {
            System.out.println("Para Üstü: "+(odeme-toplam) + "$");
        }
        System.out.println("Bizi Tercih ettiğiniz için teşekkür ederiz\nYine Bekleriz");
        cikis();

    }
    private static void cikis(){
        System.out.println("----------------------Cikis Yapiliyor---------------------");
        System.exit(0);
    }
}
