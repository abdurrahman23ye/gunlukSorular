package hHocaProje;

public class getTotal {

    public static void main(String[] args) {
        /*

        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1

     */


    /*
    3 tane pozitif String verildiğinde
    sayısal olmayan tüm karakterleri kaldırın.
    Stringleri int e çevirin
    ve total print edin

        Ornek:
       String num1 = "$15";
       String num2 = "$20";
       String num3 = "$30";
       output ----> 65; olmali

       NOT : Eğer output 0 dan küçük ise outputu -1 e cevir

     */

        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";

        int bir= Integer.valueOf(num1.replace("$",""));
        int iki= Integer.valueOf(num2.replace("$",""));
        int uc= Integer.valueOf(num3.replace("$",""));

        int sonuc= bir+iki+uc;

        System.out.println(sonuc);


    }
}
