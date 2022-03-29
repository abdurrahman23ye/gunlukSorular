package takimPratikleri;

import java.util.Scanner;

public class C10 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int sayi1= scan.nextInt();

        int faktoryel=1;

        for(int i=sayi1 ;sayi1>1;sayi1--){

            faktoryel *=sayi1;



        }

        System.out.println(faktoryel);
    }


}
