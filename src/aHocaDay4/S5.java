package aHocaDay4;

public class S5 {

    public static void main(String[] args) {
        /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        int [] input= {1,2,3,4,5,6,7,8};
        int sayac=0;

        for (int i = 0; i < input.length; i++) {

            if(input[i] %3==0){sayac++;}

        }
        System.out.println("sayac = " + sayac);


    }
}
