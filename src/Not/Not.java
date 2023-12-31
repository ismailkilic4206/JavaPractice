package Not;
import java.net.Socket;
import java.util.Scanner;
public class Not extends Not1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen ogretmen ismini giriniz: ");
        String ogretmenIsmi = scan.nextLine();
        System.out.print("Lutfen ogretmen soyismini giriniz: ");
        String ogretmenSoyisim = scan.nextLine();
        System.out.println("lutfen ogreenci isim, soyisim not girislerinde araya virgul kullaniniz");
        String[] arrayIsimler = Not1.stringArrayOlusturmaMethodu("OGRENCI ISIMLER");
        String[] arraysoyisimler = Not1.stringArrayOlusturmaMethodu("OGRENCI SOYISIMLER");
        String[] arrayNot1 = Not1.stringArrayOlusturmaMethodu("OGRENCI NOT1");
        String[] arrayNot2 = Not1.stringArrayOlusturmaMethodu("OGRENCI NOT1");
        double[] ortalmaNotlar = new double[arrayNot1.length];
        for (int i = 0; i < arrayNot1.length; i++) {
            Double ortalama = (Double.parseDouble(arrayNot1[i]) * 0.5 + Double.parseDouble(arrayNot2[i]) * 0.5);
            ortalmaNotlar[i] = ortalama;
        }
        double toplam = 0;
        for (double each : ortalmaNotlar) {
            toplam += each;
        }
        double sinifOrtalamasi = toplam / arrayNot1.length;
        String[] durum = new String[arrayNot1.length];
        for (int i = 0; i < durum.length; i++) {
            durum[i] = ortalmaNotlar[i] < sinifOrtalamasi ? "KALDI" : "GECTI";
        }
        Not1.karakter('=');System.out.println("");
        Not1.listeBasiVeriler("Wise Quarter");System.out.println("");
        Not1.listeBasiVeriler("TEAM 130");System.out.println("");
        Not1.listeBasiVeriler("Team 8");System.out.println("");
        Not1.karakter('=');System.out.println("");
        System.out.println("ISIM        SOYISIM    NOT1    NOT2    ORTALAMA   DURUM");
        Not1.karakter('-');System.out.println("");
        Not1.yazdirArrays(arrayIsimler,arraysoyisimler,arrayNot1,arrayNot2,ortalmaNotlar,durum);System.out.println("");
        String sonYazi11 = "SINIF ORTALAMASI";
        String sonyazi12 = "OGRETMEN ISMI";
        String sonYazi21 = String.valueOf(sinifOrtalamasi);
        String sonYazi22 = Character.toUpperCase(ogretmenIsmi.charAt(0))
                + ogretmenIsmi.substring(1).toLowerCase()
                + " " + ogretmenSoyisim.toUpperCase();
        String sonYazi3 ="e imzalidir";
        System.out.println(sonYazi11 + " ".repeat(Not1.limit-(sonYazi11.length()+sonyazi12.length()))+ sonyazi12
        +"\n" + sonYazi21 + " ".repeat(Not1.limit-(sonYazi21.length()+ sonYazi22.length())) +sonYazi22
        + "\n" + " ".repeat(Not1.limit - sonYazi3.length())+ sonYazi3);
        Not1.karakter('=');
    }
}
