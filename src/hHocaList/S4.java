package hHocaList;

import java.util.ArrayList;
import java.util.List;

public class S4 {

    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        List<Integer> notlar=new ArrayList<>();

        notlar.add(34);
        notlar.add(56);
        notlar.add(34);
        notlar.add(36);
        notlar.add(56);
        notlar.add(47);
        notlar.add(48);



        double toplamNot=0;


        for (int i = 0; i <notlar.size() ; i++) {

            toplamNot += notlar.get(i);

        }

        double ortalama=toplamNot/notlar.size();

        int sayac=0;

        for (int i = 0; i <notlar.size() ; i++) {

            if(notlar.get(i)>ortalama){

                sayac++;
            }

        }
        System.out.println(sayac);
    }
}
