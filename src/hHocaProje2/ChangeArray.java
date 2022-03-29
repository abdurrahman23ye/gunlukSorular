package hHocaProje2;

import java.util.ArrayList;
import java.util.List;

public class ChangeArray {

    public static void main(String[] args) {
        /*
       String bir array verildiğinde

       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevir

       Örnek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple

       Arrayi print edin

     */String[] arr={ "Peach" , "Berry" , "Orange" , "WaterMelon" , "Orange"};
        List<String>list=new ArrayList<>();

        for (String each :arr
             ) {list.add(each);

        }
        System.out.println("list = " + list);
        for (int i = 0; i < list.size() ; i++) {

            if(list.get(i).equals("Orange")){list.set(i,"Apple");}

        }
        System.out.println("list = " + list);
    }
}
