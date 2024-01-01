package S10_forLoops;

import java.util.Scanner;

public class Q09_StringiTerstenYazdirma {
    public static void main(String[] args) {
        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz: ");
        String girilenCumle = scanner.nextLine();

        String tersCumle = "";
        for (int i = girilenCumle.length() - 1; i >= 0 ; i--) {
            tersCumle += girilenCumle.charAt(i);
        }
        System.out.println(tersCumle);
    }
}