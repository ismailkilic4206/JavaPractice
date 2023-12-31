package S06_nastedIfStatements;

import java.util.Scanner;

public class Q02_haftaIciTatil {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan gun ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise
        // “Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac
        // gun kaldigini yazdirin, girilen gun
        // hafta sonu ise “Simdi dinlenme
        // zamani” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bulundugumuz gunu giriniz: ");
        String gun = scanner.next().toUpperCase();

        if ((gun.equals("CUMARTESİ")) || (gun.equals("PAZAR"))) {
            System.out.println("Simdi dinlenme zamani");
        }
        else {
            if (gun.equals("PAZARTESI")) System.out.println("Simdi calisma zamani tatile 5 gun var");
            else if (gun.equals("SALİ")) System.out.println("Simdi calisma zamani tatile 4 gun var");
            else if (gun.equals("CARSAMBA")) System.out.println("Simdi calisma zamani tatile 3 gun var");
            else if (gun.equals("PERSEMBE")) System.out.println("Simdi calisma zamani tatile 2 gun var");
            else if (gun.equals("CUMA")) System.out.println("Simdi calisma zamani tatile 1 gun var");
            }
        }
    }
