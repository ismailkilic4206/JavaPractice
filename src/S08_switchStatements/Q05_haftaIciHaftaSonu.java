package S08_switchStatements;

import java.util.Scanner;

public class Q05_haftaIciHaftaSonu {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan gun numarasini alip
        // hafta ici veya hafta sonu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz: ");
        int gun = scanner.nextInt();

        switch (gun) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Girdiginiz gun numarasi Hafta Icine aittir");
                break;
            case 6 :
            case 7 :
                System.out.println("Girdiginiz gun numarasi Hafta Sonuna aittir");
                break;
            default:
                System.out.println("Lutfen 1'den 7'ye kadar bir dager giriniz");
                break;
        }
    }
}
