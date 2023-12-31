package S08_switchStatements;

import java.util.Scanner;

public class Q03_ayNumarasiAyIsmi {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan ay numarasini alip
        // ay ismini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kacinci ayda oldugunuzu giriniz: ");
        int ay = scanner.nextInt();

        switch (ay) {
            case 1:
                System.out.println(ay+". ay OCAK ayidir..");
                break;
            case 2:
                System.out.println(ay+". ay SUBAT ayidir..");
                break;
            case 3:
                System.out.println(ay+". ay MART ayidir..");
                break;
            case 4:
                System.out.println(ay+". ay NISAN ayidir..");
                break;
            case 5:
                System.out.println(ay+". ay MAYIS ayidir..");
                break;
            case 6:
                System.out.println(ay+". ay HAZIRAN ayidir..");
                break;
            case 7:
                System.out.println(ay+". ay TEMMUZ ayidir..");
                break;
            case 8:
                System.out.println(ay+". ay AGUSTOS ayidir..");
                break;
            case 9:
                System.out.println(ay+". ay EYLUL ayidir..");
                break;
            case 10:
                System.out.println(ay+". ay EKIM ayidir..");
                break;
            case 11:
                System.out.println(ay+". ay KASIM ayidir..");
                break;
            case 12:
                System.out.println(ay+". ay ARALIK ayidir..");
                break;
            default:
                System.out.println("sadece 1'den 12'ye kadar deger girebilirsiniz");
                break;
        }
    }
}
