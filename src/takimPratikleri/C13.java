package takimPratikleri;

import java.util.Scanner;

public class C13 {

    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim
tablosu olusturun. Ornek,kullanici 3 girerse,

1 2 3
2 4 6
3 6 9
         */

        Scanner scan= new Scanner(System.in);

        int sayi= scan.nextInt();

        int input= sayi;

        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= input; j++) {

                System.out.print(i+"*"+j+"="+(i*j));
                System.out.println(" ");

            }
            System.out.println("  ");

        }
    }
}
