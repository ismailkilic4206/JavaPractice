package Not;

import java.util.Scanner;
public class Not1 {
    static int limit = 55;
    static int genislikIsim = 12;
    static int genislikSoyisim = 11;
    static int genislikNot = 8;
    static int genislikOrtalama = 11;
    public static  String[] stringArrayOlusturmaMethodu(String arrayAdi) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen " + arrayAdi + " giriniz: ");
        String bilgi = scanner.nextLine();
        return bilgi.split(",");
    }
    public static char karakter (char karakter){
        for (int i = 0; i <= limit ; i++) {
            System.out.print(karakter);
        }
        return karakter;
    }
    public static  void listeBasiVeriler (String veri){
        for (int i = 0; i < (limit - veri.length()) / 2 ; i++) {
            System.out.print(" ");
        }
        System.out.print(veri);
    }
    public static void yazdirArrays (String[] isimlerArray, String[] soyisimlerArray,
                                     String[] not1Array, String[] not2Array,
                                     double[] ortalamaArray, String[] durumArray){
        for (int i = 0; i < isimlerArray.length; i++) {
            System.out.println(Character.toUpperCase(isimlerArray[i].charAt(0))
            + isimlerArray[i].substring(1).toLowerCase()
            + " ".repeat(genislikIsim-isimlerArray[i].length())
            + soyisimlerArray[i].toUpperCase()
            + " ".repeat(genislikSoyisim-soyisimlerArray[i].length())
            +not1Array[i]
            + " ".repeat(genislikNot -not1Array[i].length())
            +not2Array[i]
            + " ".repeat(genislikNot- not2Array[i].length())
            +ortalamaArray[i]
            +" ".repeat(genislikOrtalama-String.valueOf(ortalamaArray[i]).length())
            +durumArray[i]);
        }
    }
}
