package S08_switchStatements;

import java.util.Scanner;

public class Q06_mevsim {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan ay numarasini alip
        // mevsimi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ay numarasini giriniz: ");
        int ay = scanner.nextInt();

        switch (ay) {
            case 3:
            case 4:
            case 5:
                System.out.println("Girilen ay numarasi ILKBAHAR mevsimine aittir");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Girilen ay numarasi YAZ mevsimine aittir");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Girilen ay numarasi SONBAHAR mevsimine aittir");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Girilen ay numarasi KIS mevsimine aittir");
                break;
            default:
                System.out.println("Lutfen 1'den 12'ye kadar bir deger giriniz");
        }
    }
}
