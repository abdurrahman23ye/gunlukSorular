package hHocaList;

import java.util.ArrayList;
import java.util.List;

public class AsalSayi {

    public static void main(String[] args) {
        /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */

        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Integer> asalSayilar=new ArrayList<>();

        for (int i = 0; i <100 ; i++) {

            list.add(i);

        }

        for (int i = 2; i <100 ; i++) {

            for (int j = 2; j <i ; j++) {

                if(i %j==0){
                    list2.add(i);
                }

            }

        }

        for (int i = 2; i <list.size() ; i++) {

            for (int j = 2; j <list2.size() ; j++) {

                if(!list2.contains(list.get(i))){

                  if(!asalSayilar.contains(i)){  asalSayilar.add(i);}


                }

            }

        }
        System.out.println(asalSayilar);
    }
}
