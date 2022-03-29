package hHocaStringM;

import java.util.Scanner;

public class S8 {

    public static void main(String[] args) {
        /* TASK :
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scan=new Scanner(System.in);

        String input= scan.next();

        if(input.length()>2){
            System.out.print(input.substring(input.length()-2,input.length()));System.out.print(input.substring(input.length()-2,input.length()));System.out.print(input.substring(input.length()-2,input.length()));
        }else {
            System.out.println(input);
        }
    }
}
