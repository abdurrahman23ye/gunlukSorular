package gun1;

import java.util.Scanner;

public class S4 {

    public static void main(String[] args) {
        /* Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

         */

        Scanner scan= new Scanner(System.in);

        int input= scan.nextInt();


        int sonuc = 0;


        while ( input>=0)

        { int rakam=input %10;
           sonuc+=rakam;
           input/=10;



        }
        System.out.println(sonuc);
    }
}
