package t04;

public class P02_ForLoop_EBOB_EKOK {

    // Take 2 integers from user and find
    // GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
    // Kullanicidan 2 adet tamsayi alip,
    // EBOB ve EKOK'larini bulan program yaziniz.

    public static void main(String[] args) {

        int sayi1 = 12;
        int sayi2 = 18;

        int bSayi;
        int kSayi;

        if (sayi1 > sayi2) {
            bSayi = sayi1;
            kSayi = sayi2;
        } else {
            bSayi = sayi2;
            kSayi = sayi1;
        }

        int ebob = 0;

        for (int i = kSayi; i > 0; i--) {

            if (kSayi % i == 0 && bSayi % i == 0) {
                ebob = i;
                break;
            }
        }
        int ekok = 0;

        for (int i = bSayi; i <= bSayi * kSayi; i += bSayi) {
            if (i % kSayi == 0 && i % bSayi == 0) {
                ekok = i;
                break;
            }
        }

        System.out.println("Girilen sayilarin EBOB degeri = " + ebob);
        System.out.println("Girilen sayilarin EKOK degeri = " + ekok);

        ebobHesaplama(23,46) ;
        ebobHesaplama(22,44) ;
        ebobHesaplama(45,90) ;

        ekokHesaplama(24,12) ;
        ekokHesaplama(67,12);
    }

    public static void ekokHesaplama(int x, int y) {

        int bSayi;
        int kSayi;

        if (x > y) {
            bSayi = x;
            kSayi = y;
        } else {
            bSayi = y;
            kSayi = x;
        }

        int ekok = 0;

        for (int i = bSayi; i <= bSayi * kSayi; i += bSayi) {
            if (i % kSayi == 0 && i % bSayi == 0) {
                ekok = i;
                break;
            }
        }
        System.out.println(x +" ve " + y + "sayilarin EKOK degeri= "+ ekok);
    }

    public static int ebobHesaplama(int a , int b) {

        int bSayi;
        int kSayi;

        if (a > b) {
            bSayi = a;
            kSayi = b;
        } else {
            bSayi = b;
            kSayi = a;
        }

        int ebob = 0;

        for (int i = kSayi; i > 0; i--) {

            if (kSayi % i == 0 && bSayi % i == 0) {
                ebob = i;
                break;
            }
        }
      return  ebob ;

    }
}
