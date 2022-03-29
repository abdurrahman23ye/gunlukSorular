package aHocaDay4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S12 {

    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan= new Scanner(System.in);

        int listUzunlugu= scan.nextInt();



        List<Integer> list=new ArrayList<>();

        int baslangic=0;

        do {
            list.add(listUzunlugu-listUzunlugu+baslangic,scan.nextInt() );

            baslangic++;
        }while (baslangic<listUzunlugu);

        System.out.println(list);

        List<Integer>yeniList=new ArrayList<>();

       yeniList= tekrarEdenElementleriYazdirma(list);

        System.out.println("yeniList = " + yeniList);


    }

    private static List<Integer> tekrarEdenElementleriYazdirma(List<Integer> list) {

        List<Integer>yeniList=new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            for (int j = i+1; j < list.size(); j++) {


                if(list.get(i)==list.get(j) && !yeniList.contains(list.get(i))){

                    yeniList.add(list.get(i));
                }

            }
        }

        return yeniList; }
    }



