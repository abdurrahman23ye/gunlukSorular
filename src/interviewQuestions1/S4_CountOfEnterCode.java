package interviewQuestions1;

import java.util.Scanner;

public class S4_CountOfEnterCode {

    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.(giriş Hakkı tanımlayarak)

        String pin="1234";
        int girisHakki=4;
        int count=0;

        Scanner scan=new Scanner(System.in);
        String giris="";

        System.out.println("lütfen pin kodunuzu giriniz");

        do{giris= scan.next();count++;}while (count<girisHakki &&!giris.equals(pin));
       if(count>=4) {System.out.println("Giriş işleminiz başarısız oldu");} else {
           System.out.println("Giriş başarılı");}
       }
    }

