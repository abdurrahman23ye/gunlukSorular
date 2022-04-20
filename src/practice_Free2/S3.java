package practice_Free2;

import java.util.Scanner;

public class S3 {

    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen pin giriniz");

        String input=scan.next();

        String sifre="1234";

        while (!sifre.equals(input)){

            System.out.println("Hatalı pin.Tekrar deneyiniz");

            input=scan.next();
        }
        System.out.println("Sifreniz doğru");

    }
}
