package interviewQuestions3;

import java.util.Scanner;

public class Q03_WhileCountSum {

    public static void main(String[] args) {
        //  Kullanicidan toplanmak uzere sayilar isteyin
        // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
        // bu kadar sayi yeter
        // ".. adet sayi girdin, toplami..." yazdirin

        int sayac=0;
        int toplam=0;

        Scanner scan=new Scanner(System.in);
        int input=0;

        while (sayac<10 && toplam<500){

            input=scan.nextInt();

            toplam+=input;

            sayac++;
        }
        System.out.println("Bu kadar sayi yeter. "+sayac+" sayi girdiniz. Girdiğiniz sayıların toplamı: "+toplam);

    }
}
