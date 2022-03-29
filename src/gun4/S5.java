package gun4;

import java.util.Scanner;

public class S5 {

    public static void main(String[] args) {
        // TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan= new Scanner(System.in);

        int pin= 150; //Scanner ile uğraşmamak için kullanıcı verdi varsayıyorum.

        int deneme=0;

        do {

            deneme= scan.nextInt();

            if(deneme==pin) {
                System.out.println("doğru şifre");
            }else {
                System.out.println("Tekrar deneyiniz.");
            }


        }while (!(deneme ==pin));


    }
}
