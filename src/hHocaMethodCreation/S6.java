package hHocaMethodCreation;

import java.util.ArrayList;
import java.util.List;

public class S6 {

    public static void main(String[] args) {
        /*
        TASK  :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

        String input="aabbcccccddddaaa";

        girdidekiTekrarliKarakterleriTKI(input);
    }

    private static void girdidekiTekrarliKarakterleriTKI(String input) {

        String[] arr=input.split("");
        List<String> list=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if(!list.contains(arr[i])){

                list.add(arr[i]);
            }

        }System.out.println(list);
    }
}
