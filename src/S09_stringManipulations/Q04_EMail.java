package S09_stringManipulations;

import java.util.Scanner;

public class Q04_EMail {
    public static void main(String[] args) {

        // SORU 4 : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        // yazdirin.

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen E-Mail'inizi giriniz");
        String eMail =scanner.nextLine();

        if (!(eMail.contains("@"))) System.out.println("gecersiz mail");
        else if (!(eMail.contains("@gmail.com"))) System.out.println("mail gmail olmali");
        else if (!(eMail.endsWith("@gmail.com"))) System.out.println("mailde yazim hatasi var");
    }
}
