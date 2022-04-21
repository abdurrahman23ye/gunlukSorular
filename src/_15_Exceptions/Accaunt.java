package _15_Exceptions;

import java.util.*;

public class Accaunt {

    /* 1- fieldları accountNumber(her müşteriye özel numara olmalı) ve balance (bakiye) olan bir Account class'ı create ediniz  .
            2- Account class'a deposit (ParaEkle) metodu ekleyiniz.
            3- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
            4- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verilsin
         5- Banka class'da main metodunda  account oluşturarak ihtimalleri deneyiniz.

     */

    int accountNumber= 0;
     int balance=0;
     static List<Accaunt> accaunts=new ArrayList<>();
     static Scanner scan=new Scanner(System.in);




    public Accaunt(int balance, int accountNumber) {


            this.accountNumber=accountNumber;

        this.balance=balance;
    }

   static void hesapOlusturma(int balance, int accountNumber){
        boolean flag=false;

        do{flag=false;

        try {
            accountNumber= (int)(Math.random()*50);

            for (int i = 0; i <accaunts.size() ; i++) {

                if(accaunts.get(i).accountNumber==accountNumber){throw new IllegalArgumentException("Hesap tekrarı");}
            }
        } catch (Exception e) {
            flag=true;

        }}while (flag);


        System.out.println("Lütfen bakiye giriniz.");

        balance=scan.nextInt();

        Accaunt accaunt1=new Accaunt(balance,accountNumber);

        accaunts.add(accaunt1);

       System.out.println("Hesap oluşturuldu.Ana menuye yonlerdileceksiniz");Banka.anaMenu();
    }

    static void  paraEkleme(){

        System.out.println("Lütfen işlem yapmak istediğiniz hesabı giriniz.");
        int hesapNo= scan.nextInt();

        for (int i = 0; i <accaunts.size() ; i++) {

            if(accaunts.get(i).accountNumber!=hesapNo){
                System.out.println("Hatalı hesap no girdiniz. tekrar deneyin");

                System.out.println(accaunts.get(i).accountNumber); paraEkleme();
            }else {
                System.out.println("Lütfen eklemek istediğiniz miktarı giriniz.");

                int paraEkleme= scan.nextInt();

                ListIterator itr=accaunts.listIterator();

                while (itr.hasNext()){itr.set((Integer)(itr.next())+paraEkleme);}} System.out.println("Bakiye: "+accaunts.get(i).accountNumber);}

       }

    static void  paraCekme(){

        System.out.println("Lütfen işlem yapmak istediğiniz hesabı giriniz.");
        int hesapNo= scan.nextInt();

        for (int i = 0; i <accaunts.size() ; i++) {

            if(accaunts.get(i).accountNumber!=hesapNo){
                System.out.println("Hatalı hesap no girdiniz. tekrar deneyin");

                System.out.println(accaunts.get(i).accountNumber); paraCekme();
            }else {
                System.out.println("Lütfen para çekmek istediğiniz miktarı giriniz.");


                int paraCekme= 0;
                boolean flag=false;
                do{try { flag=false;
                    paraCekme = scan.nextInt();

                    if(paraCekme>accaunts.get(i).accountNumber){throw new IllegalArgumentException();}
                    if(paraCekme>5000){throw new IllegalAccessException();}
                } catch (IllegalArgumentException e) {
                    System.out.println("Hesapta olandan daha fazla para çekemezsiniz. Lütfen yeniden deneyin."); flag=true;
                }catch (IllegalAccessException e){

                    System.out.println("Günlük para çekme limiti: 5000.  Lütfen yeniden deneyin."); flag=true;
                }} while (flag);

                ListIterator itr=accaunts.listIterator();

                while (itr.hasNext()){itr.set((int)itr.next()-paraCekme);

                    }}

            System.out.println("Bakiye: "+accaunts.get(i).accountNumber);}}

}

