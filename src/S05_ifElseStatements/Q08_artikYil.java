package S05_ifElseStatements;

import java.util.Scanner;

public class Q08_artikYil {
    public static void main(String[] args) {

        // If Else Statements
        // Soru : Interview Question
        // Kullanicidan artik yil olup olmadigini kontrol
        // etmek icin yil girmesini isteyin.
        // Kural 1: 4 ile bolunemeyen yillar artik yil
        // degildir
        // Kural 2: 4 ile bolunup 100 ile bolunemeyen
        // yillar artik yildir
        // Kural 3: 4’un kati olmasina ragmen 100 ile
        // bolunebilen yillardan sadece
        // 400’un kati olan yillar artik yildir

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen bir yil giriniz:");
        int yil = scanner.nextInt();

        if((yil % 400 == 0) && ((yil % 4 == 0) && (yil % 100 != 0)))
            System.out.println( + yil + " yılı artık bir yıldır");
        else
            System.out.println( yil + " yılı artık yıl değildir");
    }
}
