package S09_stringManipulations;

public class Q03_VerileniIStenenYapma {
    public static void main(String[] args) {


        // Soru 3 : Kullanicidan alinan metindeki
        // istenmeyen rakam ve ozel karakterleri silip,
        // sadece ilk harfi buyuk diger harfler
        // kucuk harf yapan bir program yazin.
        // input : java1 ogRe2@nMek3 #ne +Gu=zel
        // output : Java ogrenmek ne guzel.

        String alinanKelime = "   java1 ogRe2@nMek3 #ne +Gu=zel  " ;
        alinanKelime = alinanKelime.trim();
            System.out.println(alinanKelime);// java1 ogRe2@nMek3 #ne +Gu=zel
        alinanKelime = alinanKelime.replaceAll("\\d" , "");
            System.out.println(alinanKelime);// java ogRe@nMek #ne +Gu=zel
        alinanKelime = alinanKelime.replaceAll(" " , "7");
            System.out.println(alinanKelime);// java7ogRe@nMek7#ne7+Gu=zel
        alinanKelime = alinanKelime.replaceAll("\\W" , "");
            System.out.println(alinanKelime);// java7ogRenMek7ne7Guzel
        alinanKelime = alinanKelime.replaceAll("\\d" , " ");
            System.out.println(alinanKelime);// java ogRenMek ne Guzel
        alinanKelime = alinanKelime.substring(0,1).toUpperCase() + alinanKelime.substring(1).toLowerCase();
            System.out.println(alinanKelime);// Java ogrenmek ne guzel
    }
}
