package S06_nastedIfStatements;

import java.util.Scanner;

public class Q01_sayi {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir sayi alin
        // sayi tek ise negatif veya pozitif tek sayi
        // oldugunu yazdirin, sayi cift sayi ise
        // 10’un tam kati olup olmadigini
        // yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        if (!(sayi%2==0))
        {
            if (sayi<0) System.out.println(sayi +" negatif tek sayi");
            else if (sayi>0)System.out.println(sayi+" pozitif tek sayi");
        }
        else
        {
            if (sayi%10==0) System.out.println(sayi +" onun katidir.");
        }
    }
}
