package hHocaList;

import java.util.ArrayList;
import java.util.List;

public class S6 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int[] input= {1,2,2,3,1,4,2,5,6,8,7,5,9,1};

        List<Integer>list=new ArrayList<>();


        for (int i = 0; i <input.length ; i++) {



            if(!list.contains(input[i])){

                list.add(input[i]);
            }

        }
        System.out.println(list);
        }


    }

