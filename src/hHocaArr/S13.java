package hHocaArr;

import java.util.Arrays;

public class S13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */

        int[] arr= new int[8];

       int[] arr2={1,2,4,5,6,7,-9,9}; //deneme

        arr=arr2;

        int sayac=0;




        for (int i =0; i < arr.length ; i++) {

            if ( arr[i] %3==0){ sayac++;}
        }
        System.out.println(sayac);
    }
}
