package hHocaProje;

public class FactorialNumber {

    public static void main(String[] args) {
         /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720

       */

        /*
        Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720


         */


        int number= 6;
        int sonuc=1;

        for (int i = number; i >1 ; i--) {

            sonuc *= i;

            System.out.print(i+"*");

        }
        System.out.print(1+"="+sonuc);

    }
}
