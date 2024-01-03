package S11_methodOlusturma;

import java.util.Scanner;

public class Q02_stringinIstenenAraliginiYazdirma {
    public static void main(String[] args) {

        //Soru 1- Input olarak verilen bir String, baslangic ve bitis indexlerine gore
        //baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        //bir method olusturun.
        //- baslangic degeri olarak, bitis degerinden buyuk bir sayi girilirse, hata
        //mesaji verin

        istenenAraligiYazdir("Ahmet eve gel", 0, 5);
        istenenAraligiYazdir("method olusturma javada her zaman isimize yarar", 4, 16);
    }

    public static void istenenAraligiYazdir(String str, int baslangicIndexi, int bitisIndexi) {
        if (baslangicIndexi > bitisIndexi) System.out.println("Baslangic degeri bitis degerinden buyuk olamaz!!!");
        else System.out.println(str.substring(baslangicIndexi, bitisIndexi));
    }
}
