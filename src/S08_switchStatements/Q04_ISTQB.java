package S08_switchStatements;

import java.util.Scanner;

public class Q04_ISTQB {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan ISTQB kisaltmasindan
        // harfin anlamini ogrenmek istedigini alin
        // ve girilen harfin karsiligini yazdirin.
        // I : International S : Software T : Testing
        // Q : Qualifications B: Board

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen karsiligini ogrenmek istediginiz harfi giriniz (ISTQB): ");
        char iSTQB = scanner.next().toUpperCase().charAt(0);

        switch (iSTQB) {
            case 'I' :
                System.out.println("I : International");
                break;
            case 'S' :
                System.out.println("S : Software");
                break;
            case 'T' :
                System.out.println("T : Testing");
                break;
            case 'Q' :
                System.out.println("Q : Qualifications");
                break;
            case 'B' :
                System.out.println("B: Board");
                break;
            default:
                System.out.println("Lutfen kisaltmada olan harflerden birini giriniz");
                break;
        }
    }
}
