package hHocaStringM;

import java.util.Scanner;

public class S2 {

    public static void main(String[] args) {
        /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan=new Scanner(System.in);

        String input= scan.nextLine();



        String soyAd= input.substring(5);
        String Ad= input.substring(0,5);

        System.out.println("Ad = " + Ad);
        System.out.println("soyAd = " + soyAd);

    }
}
