package gun2;

import java.util.Scanner;

public class S2 {

    public static void main(String[] args) {
        /*
        Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini

soyleyin.
Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin
toplaminin kac oldugunu yazdirin.
         */

        Scanner scan=new Scanner(System.in);


        int input=0;
        int toplam=0;
        int sayac=0;

        do {
            input= scan.nextInt();

            if(input>0){ toplam+=input;  sayac++;}
        }while (input!=0);
        System.out.println(toplam);
        System.out.println(sayac);



    }
}
