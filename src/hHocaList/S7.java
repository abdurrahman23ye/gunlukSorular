package hHocaList;

import java.util.ArrayList;
import java.util.List;

public class S7 {

    public static void main(String[] args) {
        /* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };

        List<Integer>list=new ArrayList<>();


        for (int i = 0; i < arr1.length ; i++) {

            if(arr1[i]==arr1[arr1.length-1-i]){

                list.add(arr1[i]);


            }

        }
        String sonuc="";

        for (int i = 0; i < arr1.length ; i++) {

            if(arr1[i]==list.get(i)){sonuc="verilen array simetriktir.";
            } else{ sonuc="verilen array simetriktir değildir.";}
        }
        System.out.println(sonuc);
        }

        }




