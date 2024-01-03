package S11_methodOlusturma;

public class Q03_IsimSoyisimDuzenleme {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        // isim bosluk soyisim seklinde bize donduren bir method olusturun
        // input : isim : ali soyisim :yilmaz. output : Ali YILMAZ

        String isim = "ali";
        String soyisim = "yilmaz";

        isimDuzenle(isim, soyisim);
        isimDuzenle("ismail", "kilic");
        isimDuzenle("defne" , "hakan");
        isimDuzenle("fahriye", "nabi");
    }

    private static void isimDuzenle(String isim, String Soyisim) {
        System.out.println(isim.toUpperCase().charAt(0) + isim.substring(1) + " " + Soyisim.toUpperCase());
    }
}
