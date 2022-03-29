package aHocaDay2;

import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
        /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

          ORNEK:          INPUT     OUTPUT
                          goat        gat
                         photo        hoto
                         ghost        ghost
                         kalem        lem

         */

        Scanner scan= new Scanner(System.in);
        String input= scan.next();



        if(input.startsWith("gh")){
            System.out.println(input);
        } else if(input.startsWith("g")) {
            System.out.println(input.substring(0,1)+input.substring(2));
        } else if(input.substring(1,2).equals("h")){
            System.out.println(input.substring(1));
        }else{
            System.out.println(input.substring(2));
        }



    }
}
