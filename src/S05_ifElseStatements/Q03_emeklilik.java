package S05_ifElseStatements;

import java.util.Scanner;

public class Q03_emeklilik {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise ”Emekli olabilirsin”
        // yazdirin, yoksa emekli olmasi icin
        // calismasi gereken yil sayisini yazdirin.

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen yasinizi giriniz:");
        int yas = scanner.nextInt() ;

        if (yas >= 65) System.out.println("Emekli olabilirsin");
        else System.out.println("Emekli olmak icin " + (65-yas) + " yil gerekiyor");
    }
}
