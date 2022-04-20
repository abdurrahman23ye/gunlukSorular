package interviewQuestions4;

import java.util.ArrayList;
import java.util.List;

public class Q02_CreateRandomList_SetList {
    public static void main(String[] args) {

        // int array list oluşturun 10 elemandan oluşmalı
        // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemanının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        int[] arr=new int[10];

        randomEkle(arr);


    }

    private static void randomEkle(int[] arr) {

        List<Integer> list=new ArrayList<>();

        int sayac=0;
        int sayi=0;

        while(sayac<10){

            sayi= (int) (Math.random()*20);

            list.add(sayi);

            sayac++;
        }

        System.out.println("list = " + list);
        boolean ciftSayiVarMi=false;
        for (int i = 0; i < list.size() ; i++) {

            if(list.get(i)%2==0){list.set(i,111);ciftSayiVarMi=true;}


        } System.out.println("list = " + list); if(ciftSayiVarMi==false) System.out.println("Çift sayı yoktur."); }
}
