package hHocaList;

import java.util.ArrayList;
import java.util.List;

public class S5 {

    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */

        List<Integer> list=new ArrayList<>();
        List<Integer> sonuc=new ArrayList<>();

        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(14);
        list.add(15);

       sonuc= listenintekElemanlarınıAtama(list);

        System.out.println("sonuc = " + sonuc);
    }

    private static List<Integer> listenintekElemanlarınıAtama(List<Integer> list) {

        List<Integer> sonuc=new ArrayList<>();

        for (int i = 0; i < list.size() ; i++) {

            if(list.get(i) %2==1){

                sonuc.add(list.get(i));


            }

        }
    return sonuc;}
}
