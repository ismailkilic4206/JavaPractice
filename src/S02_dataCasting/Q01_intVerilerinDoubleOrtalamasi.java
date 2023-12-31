package S02_dataCasting;

public class Q01_intVerilerinDoubleOrtalamasi {
    public static void main(String[] args) {
        // Soru 1- Int olarak verilen 3 degerin ortalamasini
        // double olarak yazdiran bir kod
        // yazin

        int a = 64 ;
        int b = 51 ;
        int c = 18 ;

        double ortalama = (double) (a + b + c) / 3 ; // sag taraftaki double olmazsa sonucu int yaziyor


        System.out.println("Verilen int degerlerinin ortalamasi: " + ortalama);
    }
}
