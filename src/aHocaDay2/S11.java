package aHocaDay2;

import java.util.Scanner;

public class S11 {

    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan= new Scanner(System.in);
        String kelime1= scan.next();
        String kelime2= scan.next();
        String kelime3= scan.next();
        String kelime4= scan.next();

        System.out.println(kelime1+" "+kelime2+" "+kelime3+" "+kelime4+".");

    }
}
