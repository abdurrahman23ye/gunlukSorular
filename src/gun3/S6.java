package gun3;

public class S6 {

    public static void main(String[] args) {
        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

        int input=343;

        int rakam=0;

        int sonuc=0;

        do {
           rakam= input %10;

           sonuc +=rakam;

           input/=10;
        }while (input>0);
        System.out.println(sonuc);
    }
}
