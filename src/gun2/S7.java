package gun2;

import java.util.Scanner;

public class S7 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        char islem= scan.next().charAt(0);

        double sayi1= scan.nextInt();
        double sayi2= scan.nextInt();

        islemyap(islem,sayi1,sayi2);
    }

    private static void islemyap(char islem, double sayi1, double sayi2) {

        switch (islem) {

            case '+':
                System.out.println(sayi1 + sayi2);
                ;
                break;

            case '-':
                System.out.println(sayi1 - sayi2);
                ;
                break;

            case '*':
                System.out.println(sayi1*sayi2);
                ;
                break;
            case '/':
                System.out.println(sayi1/sayi2);
                ;
                break;

            default:
                System.out.println("Lütfen bir işlem giriniz.");
        }
    }
}
