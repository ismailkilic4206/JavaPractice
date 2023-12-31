package S05_ifElseStatements;

import java.util.Scanner;

public class Q04_buyukHarfKucukHarf {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf
        // olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Bir harf giriniz: ");
        char girilenHarf = scanner.nextLine().charAt(0) ;

        if (girilenHarf >= 'A' && girilenHarf <= 'Z') System.out.println("Girilen karakter buyuk harf");
        else System.out.println("Girilen karakter buyuk harf degil");
    }
}
