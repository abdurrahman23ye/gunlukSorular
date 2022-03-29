package hHocaList;

import java.util.ArrayList;
import java.util.List;

public class S8 {

    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        List<String>list=new ArrayList<>();

        for (String each:isimler
             ) {

            list.add(each);

        }

        System.out.println(list);

        String silinen= (list.set(2,list.get(7)));

        list.remove(7);

        list.add(7,silinen);

        System.out.println(list);






    }
}
