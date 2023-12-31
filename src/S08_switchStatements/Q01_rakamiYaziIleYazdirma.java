package S08_switchStatements;

import java.util.Scanner;

public class Q01_rakamiYaziIleYazdirma {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir rakam alip,
        // rakami yaziyla yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz: ");
        int rakam = scanner.nextInt();

        switch (rakam) {
            case 0 :
                System.out.println("SIFIR");
                break;
            case 1 :
                System.out.println("BIR");
                break;
            case 2 :
                System.out.println("IKI");
                break;
            case 3 :
                System.out.println("UC");
                break;
            case 4 :
                System.out.println("DORT");
                break;
            case 5 :
                System.out.println("BES");
                break;
            case 6 :
                System.out.println("ALTI");
                break;
            case 7 :
                System.out.println("YEDI");
                break;
            case 8 :
                System.out.println("SEKIZ");
                break;
            case 9 :
                System.out.println("DOKUZ");
                break;
        }
    }
}
