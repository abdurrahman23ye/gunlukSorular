package hHocaStringM;

import java.util.Scanner;

public class S7 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan=new Scanner(System.in);

        String input=scan.next();

        String sonuc= !input.substring(0, 1).equals(input.substring(1, 2)) && !input.substring(0, 1).equals(input.substring(2)) && !input.substring(2).equals(input.substring(1, 2)) ?"farkli":"farkli degil";

        System.out.println("sonuc = " + sonuc);
    }
}
