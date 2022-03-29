package hHocaList;

import java.util.ArrayList;
import java.util.List;

public class S3 {

    public static void main(String[] args) {
         /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List<Integer> list=new ArrayList<>();
        List<Integer> yeniList=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int sonuc=0;

        for (int i = 0; i < list.size() ; i++) {

            yeniList.add(list.get(i)*list.get(i));

             sonuc +=yeniList.get(i);

        }
        System.out.println(sonuc);




    }
}
