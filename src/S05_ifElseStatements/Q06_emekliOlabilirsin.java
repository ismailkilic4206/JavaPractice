package S05_ifElseStatements;

import java.util.Scanner;

public class Q06_emekliOlabilirsin {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan cinsiyetini ve
        // yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        // yas ve uzeri emekli olabilir. Cinsiyet
        // ve yasini dikkate alarak
        // “Emekli olabilirsin” veya
        // “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen cinsiyetinizi giriniz: (K:Kadin, E:Erkek)");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        if (cinsiyet=='E'){
            if (yas>=65) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olmak icin "+(65-yas)+" yil daha calisman gerekir");
        }
        if (cinsiyet=='K'){
            if (yas>=60) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olmak icin "+(60-yas)+" yil daha calisman gerekir");
        }
    }
}
