package S05_ifElseStatements;

import java.util.Scanner;

public class Q09_uzunluguMetreCantimerteYazma {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        // ve cevirmek istedigi birimi
        // sorun, istedigi birim metre veya
        // santimetre ise cevirip yazdirin, yoksa
        // “istediginiz birim sisteme kayitli degil” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi KM olarak giriniz: ");
        double km = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in) ;
        System.out.println("Lutfen cevirmemi istediginiz birimi giriniz (C: cantimetre, M: metre)");
        char birim =scanner.next().toUpperCase().charAt(0);

        double santi = (km*100000) ;
        double metre = (km*1000) ;

        if (birim=='M') {
            System.out.println("Girdiginiz messafenin M degeri: "+ metre);
        }
        else if (birim=='C') {
            System.out.println("Girdiginiz messafenin CM degeri: "+ santi);
        }
    }
}
