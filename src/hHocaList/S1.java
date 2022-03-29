package hHocaList;

import java.util.ArrayList;
import java.util.List;

public class S1 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> list=new ArrayList<>();

         String[] arr={"Ali","Veli","Ayse","Fatma","Omer"};

         list.add("Ali");
         list.add("Veli");
         list.add("Ayse");
         list.add("Fatma");
         list.add("Omer");

        for (int i = 0; i <list.size() ; i++) {

            if(list.get(i).contains("a")||list.get(i).contains("A")){

                list.remove(i);
            }

        }
        System.out.println(list);



    }
}
