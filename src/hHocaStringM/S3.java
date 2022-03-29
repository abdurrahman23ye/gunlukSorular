package hHocaStringM;

import java.util.Scanner;

public class S3 {

    public static void main(String[] args) {
        /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scan= new Scanner(System.in);

        String input= scan.nextLine();



        System.out.println(input.substring(0,1)+"."+input.substring(input.indexOf(" ")+1,input.indexOf(" ")+2)+
                "."+input.substring(input.lastIndexOf(" ")+1,input.lastIndexOf(" ")+2)+".");


    }
}
