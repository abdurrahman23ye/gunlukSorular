package gun4;

import java.util.Scanner;

public class S4 {

    public static void main(String[] args) {

        /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.

       */

        Scanner scan= new Scanner(System.in);

        String deneme="";

        String x= "x";

        do {
            deneme= scan.next();

            if(!deneme.equalsIgnoreCase("x")) {
                System.out.println("program çalışıyor.");
            }
        } while (!deneme.equals("x"));
        System.out.println("program bitti.");

    }
}
