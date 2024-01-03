package S11_methodOlusturma;

public class Q01_verilenStringiTersYazdirma {
    public static void main(String[] args) {
        //Soru 1-verilen bir String ifadeyi ters ceviren bir method olusturun
        String kelime = "cumle";

        System.out.println(verilenAraliktakiHarfleriYazdirma(kelime));
        System.out.println(verilenAraliktakiHarfleriYazdirma("äli gel"));
    }

    public static String verilenAraliktakiHarfleriYazdirma(String kelime) {
        String bosKova = "";
        for (int i = kelime.length() - 1; i >= 0 ; i--) {
            bosKova += kelime.charAt(i);
        }
        String tersMetin = bosKova;

        return tersMetin;
    }
}
