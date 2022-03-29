package hHocaProje;

public class checkNumberEven {

    public static void main(String[] args) {

        /*
        Given an int check the number is even or not

        if the number is even print true

        if the number is odd print false

        result should be true or false.

     */


     /*
        Veri tipi int olan number verildiğinde, number  çift mi tek mi kontrol et

        Eğer number çift ise  print true

        Eğer number tek ise  print false

        result true ya da false olmalı.

     */


        int input= 23232;

        boolean sayiCiftMi=false;

        if(input%2==0){
            sayiCiftMi=true;
            System.out.println(sayiCiftMi);
        } else{
            System.out.println(sayiCiftMi);
        }

    }
}
