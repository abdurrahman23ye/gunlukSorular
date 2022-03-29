package hHocaProje;

public class totalLetterCountCheck {

    public static void main(String[] args) {
         /*
        Given a String ,
            if the count of the letter in the String is odd print true else print false

     */

    /*
     Bir String verildiğinde

     Eger String harf sayisi tek ise true print et değilse false print et

     */

        String input="bir şeyler.";

        String[] arr=input.split("");

        boolean uzunlukTekMi=true;

        if(arr.length %2==0){uzunlukTekMi=true;}

        System.out.println(uzunlukTekMi);
    }
}
