package interviewQuestions4;

import java.util.ArrayList;
import java.util.List;

public class Q05_SpecialCharRemoveArray {

    public static void main(String[] args) {

        /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.

    */


        List<String> list=new ArrayList<>();

        list.add("-$13");
        list.add("$0");
        list.add("$0");

        int getSum= getSum(list);

        System.out.println("getSum = " + getSum);

    }

    private static int getSum(List<String> list) {

        int getSum=0;

        for (int i = 0; i < list.size() ; i++) {

           getSum+=Integer.valueOf(list.get(i).replace("$",""));

        } if(getSum<0) getSum=-1;
    return getSum;}
}
