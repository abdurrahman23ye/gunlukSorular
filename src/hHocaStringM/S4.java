package hHocaStringM;

import java.util.Scanner;

public class S4 {

    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan= new Scanner(System.in);

        String input= scan.next();
        String terstenInput="";
        System.out.print(input.substring(input.length()-1));
        for (int i =0; i<input.length()-1; i++) {



            System.out.print( input.substring(input.length()-2-i,input.length()-1-i));


        }

    }
}
