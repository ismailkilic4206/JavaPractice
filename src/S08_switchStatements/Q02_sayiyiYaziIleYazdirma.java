package S08_switchStatements;

import java.util.Scanner;

public class Q02_sayiyiYaziIleYazdirma {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan 2 basamakli bir sayi alip,
        // girilen sayiyi yazi ile yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki basamakli bir sayi giriniz: ");
        int rakam = scanner.nextInt();

        int birlerBasamagi =rakam%10;
        int onlarBasamagi = rakam/10;


        switch (onlarBasamagi) {
            case 1 :
                System.out.print("on");
                break;
            case 2 :
                System.out.print("yirmi");
                break;
            case 3 :
                System.out.print("otuz");
                break;
            case 4 :
                System.out.print("kirk");
                break;
            case 5 :
                System.out.print("elli");
                break;
            case 6 :
                System.out.print("altmis");
                break;
            case 7 :
                System.out.print("yetmis");
                break;
            case 8 :
                System.out.print("seksen");
                break;
            case 9 :
                System.out.print("doksan");
                break;
            default:
                System.out.print("Lutfen iki basamakli bir sayi giriniz.");
        }
        switch (birlerBasamagi) {
            case 0 :
                break;
            case 1 :
                System.out.print("bir");
                break;
            case 2 :
                System.out.print("iki");
                break;
            case 3 :
                System.out.print("uc");
                break;
            case 4 :
                System.out.print("dort");
                break;
            case 5 :
                System.out.print("bes");
                break;
            case 6 :
                System.out.print("alti");
                break;
            case 7 :
                System.out.print("yedi");
                break;
            case 8 :
                System.out.print("sekiz");
                break;
            case 9 :
                System.out.print("dokuz");
        }
    }
}
