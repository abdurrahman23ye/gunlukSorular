package interviewQuestions4;

import java.util.ArrayList;
import java.util.List;

public class Q01_UniqeArray {

    public static void main(String[] args) {
        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */

        int[] input={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        List<Integer> list=new ArrayList<>();

        for (int i = 0; i <input.length ; i++) {if(!list.contains(input[i]))list.add(input[i]);}

        System.out.println(list);
    }
}
