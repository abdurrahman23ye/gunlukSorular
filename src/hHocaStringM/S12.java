package hHocaStringM;

import java.util.Scanner;

public class S12 {

    public static void main(String[] args) {
        /* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */

        Scanner scan= new Scanner(System.in);

        String eMail= scan.next();



        if(!eMail.contains("@")){
            System.out.println("Lütfen geçerli bir e-mail giriniz.");
        } else if(eMail.indexOf("@")+1!=eMail.indexOf("gmail.com")){
            System.out.println("Lutfen gmail hesabinizi girin");
        } else if(eMail.substring(eMail.indexOf("@")+1).equals("gmail.com")){
            System.out.println("E-mail adresiniz onaylandi.");
        }
    }
}
