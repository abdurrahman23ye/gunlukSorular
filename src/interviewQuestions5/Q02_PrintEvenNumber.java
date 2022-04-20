package interviewQuestions5;

public class Q02_PrintEvenNumber {

    public static void main(String[] args) {

        /*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    */

        int sayi=7;

        ciftMi(sayi);


    }

    private static void ciftMi(int sayi) {
        boolean sayiCiftMi=true;
        if(sayi%2!=0){sayiCiftMi=false;}

        System.out.println("sayiCiftMi = " + sayiCiftMi);
    }
}
