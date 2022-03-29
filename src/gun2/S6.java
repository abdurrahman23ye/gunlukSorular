package gun2;

import java.util.Scanner;

public class S6 {
    public static void main(String[] args) {

    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

        Scanner scan= new Scanner(System.in);

        char islem= scan.next().charAt(0);

        double sayi1= scan.nextInt();
        double sayi2= scan.nextInt();

        switch (islem){

            case '+':
                System.out.println(sayi1+sayi2);; break;

            case '-':
                System.out.println(sayi1-sayi2);; break;

            case '*':
                System.out.println(sayi1*sayi2);; break;
            case '/':
                System.out.println(sayi1/sayi2);; break;

            default:
                System.out.println("Lütfen bir işlem giriniz.");

        }

    }
}
