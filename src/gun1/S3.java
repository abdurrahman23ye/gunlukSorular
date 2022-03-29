package gun1;

import java.util.Scanner;

public class S3 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane

olduklarini ekranda yazdirin
         */

        Scanner scan= new Scanner(System.in);

        int input= scan.nextInt();

        int bolen=1;
        int sayac=0;
        while (bolen<=input)

        {
             if(input%bolen==0){

                 System.out.println(bolen);
                 System.out.println();

                 sayac++;
             }


             bolen++;
        } System.out.println(sayac);
    }
}
