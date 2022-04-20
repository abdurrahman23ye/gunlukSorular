package hHocaForLoop;

import java.util.Scanner;

public class S4 {

    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        int sayac=0;

        Scanner scan=new Scanner(System.in);

        int input=0;

        int sonuc=1;

        do { sayac++;
            input=scan.nextInt();

            if(input<5 && input<10){

                sonuc +=input;
            }

        } while (sayac<6);

        System.out.println("sonuc = " + sonuc);



        }
    }

