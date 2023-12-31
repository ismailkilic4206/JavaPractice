package t01;

import java.util.Scanner;

public class S05_If {
    public static void main(String[] args) {
         /*
    1. Basit bir Kahve makinesi oluşturun. 3 çeşit kahvemiz olsun.
    2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
    3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
        Hangi Kahveyi İstersiniz?
        Türk kahvesi
        Filtre Kahve
        Espresso
   String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
  (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
       1.kosul
      Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.
      Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.
      Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
      Eğer yanlış harf girerseniz, konsola = "Hatali giris yaptiniz, tekrar baslayiniz." yazsın.
      (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi Kahveyi İstersiniz? "+ "\nTürk Kahvesi" + "\nFiltre kahve" + "\nEspresso");
        String hangikahve= scan.nextLine();
        if (hangikahve.equalsIgnoreCase("Türk Kahvesi")||hangikahve.equalsIgnoreCase("Turk Kahvesi")){
            System.out.println("Türk kahvesi hazırlanıyor");
        } else if (hangikahve.equalsIgnoreCase("Filtre Kahve")) {
            System.out.println("Filtre kahve hazırlanıyor");
        } else if (hangikahve.equalsIgnoreCase("Espresso")) {
            System.out.println("Espresso hazırlanıyor...");
        }else {
            System.out.println("Hatali giris yaptiniz, tekrar baslayiniz.");
        }
        /*
        to do-------
      Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):
         "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
     String sut olusturun.
                                                  2. kosul Bolümü
     eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.
      -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın.
       Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.
    eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
    Evet ve hayir disinda bir giris olursa hatali giris mesaji yazdirsin
         */
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
        String sut= scan.nextLine();
        if (sut.equalsIgnoreCase("Evet")){
            System.out.println("Sut ekleniyor");
        } else if (sut.equalsIgnoreCase("Hayir")) {
            System.out.println("Sut eklenmiyor");
        }else {
            System.out.println("Hatali giris yaptiniz");
        }
/*
        to do----------------
      Sistem bize "seker ister misiniz ? (Evet veya hayır cevabını veriniz) :
       " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
      String seker oluşturunuz.
                                               3. kosul Bolümü
    to do if(){
      Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı.
      Sorunun altına int kacSeker  oluşturunuz.
      seker sayısını giriniz.
      Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
      to do }
      toda else {
  Eğer String şeker  hayır 'a eşitse, sistem bize "seker eklenmiyor" cevabını versin.
         */
        System.out.println("Seker ister misiniz ? (Evet veya hayır cevabını veriniz) :");
        String seker= scan.nextLine();
        int kacseker;
        if (seker.equalsIgnoreCase("Evet")){
            System.out.println("Kaç şeker olsun?");
            kacseker=scan.nextInt();
            System.out.println(kacseker + " seker ekleniyor");
        }else {
            System.out.println("Seker eklenmiyor");
        }
/*
        to do----------------
        Sistem bize "Hangi boyutta olsun? (Büyük  - orta  - küçük  olarak giriniz.) :
 sorusunu sorsun. (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
String boyut oluşturun...
                                                4. kosul Bolümü
      eğer String boyut Büyük' e eşitse =  Kahveniz büyük boy hazırlanıyor.
      (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
      Eğer String boyut  Orta'ya eşitse = Kahveniz orta boy hazırlanıyor..
      ("Kahveniz" + boyut + "hazırlanıyor.)
      Eğer String boyut  Küçük'e eşitse = Kahveniz küçük boy hazırlanıyor.
        yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)
         */
        /*
        ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,
  araya boş bir nextLine koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
         */
        String boskod=scan.nextLine();
        System.out.println("Hangi boyutta olsun? (Büyük  - orta  - küçük  olarak giriniz.) :");
        String boyut=scan.nextLine();
        if (boyut.equalsIgnoreCase("Büyük")||boyut.equalsIgnoreCase("Buyuk")){
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
        } else if (boyut.equalsIgnoreCase("orta")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
        } else if (boyut.equalsIgnoreCase("kucuk")||boyut.equalsIgnoreCase("kücük")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
        }
/*
         //sonuc
     Siparişlerimizi verdik. Son hali görmek istiyoruz, konsola şunu yazdırın örnek :
         orta boy Türk Kahvesi sizin icin özenle hazırlandi. Afiyet olsun !!!
         */
        System.out.println("Beklediginiz icin tesekkürler");
        System.out.println(boyut + " boy " + hangikahve + " sizin icin özenle hazırlandi. Afiyet olsun !!!");
    }

}
