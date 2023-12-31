package t04;

import java.util.Scanner;

public class P01_IfStatement_DogumGunuKiyaslama {
    public static void main(String[] args) {

        /*
    Kullanicidan iki farkli dogum gunu tarihini alip,
    kimin once dogdugunu consolda yazdiran bir program yaziniz.
     */

        Scanner scanner = new Scanner(System.in);

        System.out.println("kiyaslamak istediginiz dogum tarihlerinden ilkini yyyy/aa/gg seklinde giriniz:");
        String dogumTarihi1 = scanner.nextLine() ; // 2004/04/14


        System.out.println("kiyaslamak istediginiz dogum tarihlerinden ikincisini yyyy/aa/gg seklinde giriniz:");
        String dogumTarihi2 = scanner.nextLine() ; // 2007/09/22

        int yil1 = Integer.parseInt(dogumTarihi1.replaceAll(" ","").substring(0,4));  //String dondurur
        int ay1 = Integer.parseInt(dogumTarihi1.replaceAll(" ","").substring(5,7));  //String dondurur
        int gun1 = Integer.parseInt(dogumTarihi1.replaceAll(" ","").substring(8));  //String dondurur

        int yil2 = Integer.parseInt(dogumTarihi2.replaceAll(" ","").substring(0,4));  //String dondurur
        int ay2 = Integer.parseInt(dogumTarihi2.replaceAll(" ","").substring(5,7));  //String dondurur
        int gun2 = Integer.parseInt(dogumTarihi2.replaceAll(" ","").substring(8));  //String dondurur

        if (yil1>yil2) System.out.println("İkinci girilen dogum tarihinin sahibi daha yaslidir!!!");
        else if (yil1<yil2) System.out.println("İlk girilen dogum tarihinin sahibi daha yaslidir!!!");
        else { // iki dogum yilinin da esit oldugu durum islenmeye baslar

            if (ay1>ay2) System.out.println("İkinci girilen dogum tarihinin sahibi daha moruktur!!!");
            else if (ay1<ay2) System.out.println("İlk girilen dogum tarihinin sahibi daha moruktur!!!");
            else { // iki dogum yilinin da esit oldugu durum islenmeye baslar

                if (gun1>gun2) System.out.println("İkinci girilen dogum tarihinin sahibi daha dededir!!!");
                else if (gun1<gun2) System.out.println("İkinci girilen dogum tarihinin sahibi daha dededir!!!");
                else { // iki dogum yilinin da esit oldugu durum islenmeye baslar
                    System.out.println("Aynı dogum tarihine sahipsiniz");
                }


            }
        }
    }
}